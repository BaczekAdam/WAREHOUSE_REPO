package MainPackage;

import java.util.HashSet;
import java.time.LocalDate;

public class Cargo {

    private String cCategory;
    private String cDescription;

    LocalDate cArrivalDate;
    HashSet<Package> cPackages = new HashSet<>();

    public float cMass;

    Cargo(String description, LocalDate arrivalDate) {
        this.cDescription = description;
        cCategory = "Industrial";
        cArrivalDate = arrivalDate;
    }

    public void addPackage(Package pack) {
        cPackages.add(pack);
        calculateMass();
    }

    private void calculateMass() {
        cMass = 0.0f;
        for (Package pack : cPackages)
            cMass += pack.pMass;
    }

    public void displayDetails() {

    }

    @Override
    public String toString() {
        return '\'' + cDescription + '\'' +
                ", Cargo mass = " + cMass + "\n";
    }
}
