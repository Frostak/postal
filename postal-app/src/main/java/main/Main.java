package main;

import controller.TimeDemon;
import entity.Package;
import entity.Shipment;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Timer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final int TIME_INTERVAL = 60000; // 1000MS = 1sec

    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        TimeDemon timeDemon = new TimeDemon();
        timer.schedule(timeDemon, 0, TIME_INTERVAL);

        Shipment simpleShipment = timeDemon.getSimpleShipment();

        for (int i = 1; i < 6; i++) {
            Package newPackage = new Package();
            newPackage.setPostalCode(28600 + i);
            newPackage.setItemsTax(BigDecimal.valueOf(Math.random() * 100));
            newPackage.setItemsWeight(BigDecimal.valueOf(Math.random() * 1000));

            simpleShipment.insertPackage(newPackage);
        }

        simpleShipment.getPackageList()
                .forEach(System.out::println);

        try (Stream<Path> stream = Files.walk(Path.of("\\initFile.txt"))) {
            List<Path> result = stream.collect(Collectors.toList());

            result.forEach(System.out::println);
        } catch (IOException e) {
            throw new Exception(e.getMessage());
        }
    }
}
