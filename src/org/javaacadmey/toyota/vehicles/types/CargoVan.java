package org.javaacadmey.toyota.vehicles.types;

public abstract class CargoVan extends Car {
    private int cargoCapacity;

    protected CargoVan(String model) {
        super(model);
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
