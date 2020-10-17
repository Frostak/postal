package entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Shipment {

    /**
     * List containing packages
     */
    private List<Package> packageList;

    /**
     * Method for inserting packages into PackageList
     */
    public void insertPackage(Package insertedPackage) {
        packageList.add(insertedPackage);
    }

    /**
     * Initialize packageList
     */
    public void initPackageList() {
        packageList = new ArrayList<>();
    }
}
