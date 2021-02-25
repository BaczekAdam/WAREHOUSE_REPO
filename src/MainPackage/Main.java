package MainPackage;

public class Main {
    public static void main(String[] args) {

        //początek programu wstępny tekst i testowe zmienne
        System.out.println("-----WAREHOUSES-----");


        String loc1 = "Lodz, Piotrkowska";
        String descr1 = "Towar do użytku 1";

        Warehouse war1 = new Warehouse(loc1, 20.0f);
        Cargo cargo1 = new Cargo(descr1);

        war1.AddCargo(cargo1);


        System.out.println(war1.toString());

    }
}
