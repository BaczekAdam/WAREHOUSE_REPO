package MainPackage;

import java.util.ArrayList;

public class Warehouse {

    private String location;
    private float capacity;

    ArrayList<Cargo> cargoList = new ArrayList<>();


    Warehouse(String location, float capacity) {
        this.location = location;
        this.capacity = capacity;
    }

    public void AddCargo(Cargo addedCargo){
        cargoList.add(addedCargo);
    }


    @Override
    public String toString() {

        String allCargo = "";

        for(Cargo cargo : cargoList)
            allCargo = allCargo.concat(cargo.toString());

        return "\n" +
                "location='" + location + '\'' +
                ", capacity=" + capacity + "\n" +
                "cargoList: \n" + allCargo;
    }
}
