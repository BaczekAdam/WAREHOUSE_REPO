package MainPackage;

import java.util.HashSet;

public class Cargo {

    enum Category {
        Industrial,
        RawMaterial,
        Merchandise,
        Other
    }


    private String cDescription;
    private float cMass;
    HashSet<Package> cPackages = new HashSet<>();

    Cargo(String description) {
        this.cDescription = description;
    }

    @Override
    public String toString() {
        return '\'' + cDescription + '\'' +
                ", Cargo mass=" + cMass;
    }
}
