package org.javaacadmey.toyota;

import org.javaacadmey.toyota.components.*;

public class Factory {
    private String country;

    public Factory(String country) {
        this.country = country;
    }

    public Wheel createWheel(int diameter) {
        return new Wheel(false, diameter);
    }

    public FuelTank createFuelTank() {
        return new FuelTank(0);
    }

    public Engine createEngine() {
        return new Engine(true);
    }

    public ElectricalSystem createElectricalSystem() {
        return new ElectricalSystem(true);
    }

    public Headlight createHeadlights() {
        return new Headlight();
    }
}
