package MainPackage;

import java.util.ArrayList;

public class Warehouse {

    private String location;
    private float capacity;

    ArrayList<Cargo> cargos = new ArrayList<>();


    Warehouse(String location, float capacity) {
        this.location = location;
        this.capacity = capacity;
    }


}
