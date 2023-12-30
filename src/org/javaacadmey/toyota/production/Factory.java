package org.javaacadmey.toyota.production;

import org.javaacadmey.toyota.components.*;

public class Factory {
    private String country;

    public Factory(String country) {
        this.country = country;
    }

    public Wheel[] createWheels(int diameter) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = createWheel(diameter);
        }
        return wheels;
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

    public Headlight[] createHeadlights() {
        return new Headlight[]{createHeadlight(), createHeadlight()};
    }

    private Headlight createHeadlight() {
        return new Headlight();
    }

    public String getCountry() {
        return country;
    }
}
