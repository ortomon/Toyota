package org.javaacadmey.toyota.vehicles.components;

public class CruiseControl {
    private boolean isWork;

    public CruiseControl() {
        this.isWork = false;
    }

    public void cruiseControlTurnOn() {
        isWork = true;
        System.out.println("Круиз-контроль включен.");
    }

    public void cruiseControlTurnOff() {
        isWork = false;
        System.out.println("Круиз-контроль выключен.");
    }

    public boolean isWork() {
        return isWork;
    }

    @Override
    public String toString() {
        return "CruiseControl{" +
                "isWork=" + isWork +
                '}';
    }
}
