package MainPackage;

import java.util.HashSet;

public class Cargo {

    private String cDescription;
    HashSet<Package> cPackages = new HashSet<>();

    public float cMass;

    Cargo(String description) {
        this.cDescription = description;
    }

    public void addPackage(Package pack){
        cPackages.add(pack);
        calculateMass();
    }

    private void calculateMass()
    {
        cMass = 0.0f;
        for(Package pack : cPackages)
            cMass += pack.pMass;
    }

    @Override
    public String toString() {
        return '\'' + cDescription + '\'' +
                ", Cargo mass = " + cMass + "\n";
    }
}
