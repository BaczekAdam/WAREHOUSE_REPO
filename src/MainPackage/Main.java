package MainPackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Warehouse> warehouses = new ArrayList<>();
        //początek programu wstępny tekst i testowe zmienne
        System.out.println("-----WAREHOUSES-----");

        LocalDate date1 = LocalDate.now();

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
        Cargo cargo1 = new Cargo(descr1, date1);
        Cargo cargo2 = new Cargo(descr2, date1);
        Package pack1 = new Package(pDesc1, 1.0f);
        Package pack2 = new Package(pDesc2, 2.0f);
        Package pack3 = new Package(pDesc3, 3.0f);
        Package pack4 = new Package(pDesc4, 4.0f);

        warehouses.add(war1);
        warehouses.add(war2);

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (!exit) {
            for (Warehouse war : warehouses)
                System.out.println(war.toString());

            System.out.println("Options:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Wybrano 1");
                case 5 -> exit = true;
                default -> System.out.println("Wybrano niepoprawną opcję");
            }

        }

    }
}
