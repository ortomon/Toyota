package org.javaacadmey.toyota.vehicles.components;

public class ElectricalSystem {
    private boolean isFine;

    public ElectricalSystem(boolean isFine) {
        this.isFine = isFine;
    }

    public boolean isFine() {
        return isFine;
    }

    public void setFine(boolean fine) {
        isFine = fine;
    }

    @Override
    public String toString() {
        return "oElectricalSystem{" +
                "isFine=" + isFine +
                '}';
    }
}
