package controller;

import entity.Shipment;
import java.util.TimerTask;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TimeDemon extends TimerTask {

    Shipment simpleShipment = new Shipment();

    @Override
    public void run() {
        System.out.println("Program is running ...");
        simpleShipment.initPackageList();
    }
}
