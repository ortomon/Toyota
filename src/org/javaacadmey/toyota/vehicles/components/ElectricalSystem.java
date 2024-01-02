package org.javaacadmey.toyota.vehicles.components;

/**
 * Электрика имеет атрибут - работоспособна
 */
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
        return "org.javaacadmey.toyota.vehicles.components.ElectricalSystem{" +
                "isFine=" + isFine +
                '}';
    }
}