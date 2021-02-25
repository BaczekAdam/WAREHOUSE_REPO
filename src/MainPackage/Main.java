package MainPackage;

public class Main {

    public static void main(String[] args) {


        //początek programu wstępny tekst i testowe zmienne
        System.out.println("-----WAREHOUSES-----");


        String loc1 = "Łódz, Piotrkowska";
        String loc2 = "Warszawa, Obywatelska";
        String descr1 = "Ładunek 1";
        String descr2 = "Ładunek 2";
        String pDesc1 = "Nazwa towaru 1";
        String pDesc2 = "Nazwa towaru 2";
        String pDesc3 = "Nazwa towaru 3";
        String pDesc4 = "Nazwa towaru 4";

        Warehouse war1 = new Warehouse(loc1, 20.0f);
        Warehouse war2 = new Warehouse(loc2, 5.0f);
        Cargo cargo1 = new Cargo(descr1);
        Cargo cargo2 = new Cargo(descr2);
        Package pack1 = new Package(pDesc1, 1.0f);
        Package pack2 = new Package(pDesc2, 2.0f);
        Package pack3 = new Package(pDesc3, 3.0f);
        Package pack4 = new Package(pDesc4, 4.0f);

        cargo1.addPackage(pack1);
        cargo1.addPackage(pack2);
        cargo2.addPackage(pack3);
        cargo2.addPackage(pack4);

        war1.AddCargo(cargo1);
        war1.AddCargo(cargo2);


        System.out.println(war1.toString());

        war1.moveCargoToAnotherWarehouse(cargo2,war2);

        System.out.println(war1.toString());
        System.out.println(war2.toString());

    }
}
