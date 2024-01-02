package org.javaacadmey.toyota.vehicles.types;

public abstract class Cabriolet extends Sedan {
    private boolean isRoofDown;

    protected Cabriolet(String model) {
        super(model);
    }

    public void raiseRoof() {
        isRoofDown = false;
        System.out.println("Крыша кабриолета поднята.");
    }

    public void lowerRoof() {
        isRoofDown = true;
        System.out.println("Крыша кабриолета опущена.");
    }

    public boolean isRoofDown() {
        return isRoofDown;
    }
}
