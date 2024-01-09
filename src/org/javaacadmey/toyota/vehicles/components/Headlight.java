package org.javaacadmey.toyota.vehicles.components;

public class Headlight {
    private boolean areOn = false;

    public boolean isAreOn() {
        return areOn;
    }

    public void turnOn() {
        this.areOn = true;
    }

    public void turnOff() {
        this.areOn = false;
    }

    @Override
    public String toString() {
        return "org.javaacadmey.toyota.vehicles.components.Headlight{" +
                "isFine=" + areOn +
                '}';
    }
}
