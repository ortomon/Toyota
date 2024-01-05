package org.javaacadmey.toyota.vehicles.components;

import org.javaacadmey.toyota.vehicles.exception.NegativeFuelLevelException;

public class FuelTank {
    private int fuelLevel;

    public FuelTank(int fuelLevel) {
        checkFuelLevel(fuelLevel);
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        checkFuelLevel(fuelLevel);
    }

    private void checkFuelLevel(int fuelLevel) {
        if (fuelLevel >= 0) {
            this.fuelLevel = fuelLevel;
        } else {
            throw new NegativeFuelLevelException();
        }
    }

    @Override
    public String toString() {
        return "org.javaacadmey.toyota.vehicles.components.FuelTank{" +
                "fuelLevel=" + fuelLevel +
                '}';
    }
}
