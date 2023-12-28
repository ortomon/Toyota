package org.javaacadmey.toyota.components;

/**
 * Бензобак имеет атрибут - количество бензина
 */

public class FuelTank {
    private int fuelLevel;

    public FuelTank(int fuelLevel) {
        if (checkFuelLevel()) {
            this.fuelLevel = fuelLevel;
        } else {
            System.out.println("ошибка: количество топлива не может быть отрицательным!");
        }
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    private boolean checkFuelLevel() {
        return fuelLevel >= 0;
    }
    @Override
    public String toString() {
        return "org.javaacadmey.toyota.components.FuelTank{" +
                "fuelLevel=" + fuelLevel +
                '}';
    }
}
