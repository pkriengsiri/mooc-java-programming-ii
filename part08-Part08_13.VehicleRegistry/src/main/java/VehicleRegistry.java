import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> plates;

    public VehicleRegistry() {
        this.plates = new HashMap<>();
    }

    public boolean add(LicensePlate licenceplate, String owner) {

        if (plates.containsKey(licenceplate)) {
            return false;
        }

        plates.put(licenceplate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        
        return plates.getOrDefault(licensePlate,null);
    }

    public boolean remove(LicensePlate licensePlate) {
        
            if (plates.containsKey(licensePlate)) {
                plates.remove(licensePlate);
                return true;
            }
        
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : plates.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : plates.values()) {
            if (!owners.contains(owner)) {
                System.out.println(owner);
                owners.add(owner);
            }
        }

    }

}
