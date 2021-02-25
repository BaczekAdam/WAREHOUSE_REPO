package MainPackage;

import java.util.ArrayList;

public class Warehouse {

    private String location;
    private float maxCapacity;

    ArrayList<Cargo> cargoList = new ArrayList<>();


    Warehouse(String location, float capacity) {
        this.location = location;
        this.maxCapacity = capacity;
    }

    public boolean AddCargo(Cargo addedCargo) {
        boolean added = false;

        if (calculateMass() + addedCargo.cMass < maxCapacity) {
            cargoList.add(addedCargo);
            added = true;
        } else
            System.out.println("Nie można dodać nowego towaru");

        return added;
    }

    public void RemoveCargo(Cargo deletedCargo) {
        if (chceckIfContainsCargo(deletedCargo))
            cargoList.remove(deletedCargo);
        else
            System.out.println("Magazyn nie zawiera tego ładunku");

    }

    private float calculateMass() {
        float allCargoMass = 0.0f;

        for (Cargo cargo : cargoList)
            allCargoMass += cargo.cMass;

        return allCargoMass;
    }

    private boolean chceckIfContainsCargo(Cargo checkCargo) {
        boolean contains = false;

        for (Cargo cargo : cargoList) {
            if (checkCargo.equals(cargo)){
                contains = true;
                break;
            }
        }
        return contains;
    }

    public void moveCargoToAnotherWarehouse(Cargo cargoToMove, Warehouse destWarehouse) {
        if (chceckIfContainsCargo(cargoToMove)) {
            if (destWarehouse.AddCargo(cargoToMove))
                RemoveCargo(cargoToMove);
            else
                System.out.println("Nie można dodać ładunku do tego magazynu");
        }
    }

    @Override
    public String toString() {

        String allCargo = "";

        for (Cargo cargo : cargoList)
            allCargo = allCargo.concat(cargo.toString());

        if (allCargo.isEmpty())
            allCargo = "Brak towarów";

        return "\n" +
                "location = '" + location + '\'' +
                ", capacity = " + maxCapacity + "\n" +
                "cargoList: \n" + allCargo;
    }
}
