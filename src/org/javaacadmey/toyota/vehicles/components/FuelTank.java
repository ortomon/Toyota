package org.javaacadmey.toyota.vehicles.components;

import org.javaacadmey.toyota.vehicles.exception.NegativeFuelLevelException;

public class FuelTank {
    private int fuelLevel;

    public FuelTank(int fuelLevel) {
        if (checkFuelLevel(fuelLevel)) {
            this.fuelLevel = fuelLevel;
        } else {
            throw new NegativeFuelLevelException();
        }
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        if (checkFuelLevel(fuelLevel)) {
            this.fuelLevel = fuelLevel;
        } else {
            throw new NegativeFuelLevelException();
        }
    }

    private boolean checkFuelLevel(int fuelLevel) {
        return fuelLevel >= 0;
    }

    @Override
    public String toString() {
        return "org.javaacadmey.toyota.vehicles.components.FuelTank{" +
                "fuelLevel=" + fuelLevel +
                '}';
    }
}
