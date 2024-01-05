package org.javaacadmey.toyota.vehicles.types;

import org.javaacadmey.toyota.vehicles.components.*;
import org.javaacadmey.toyota.vehicles.exception.StartCarException;

public abstract class Car {
    private static final int EMPTY_FUEL_TANK = 0;

    private final String model;
    private Double price;
    private String color;
    private int maxSpeed;
    private boolean isMoving;

    private Transmission transmission;
    private Wheel[] wheels;
    private FuelTank fuelTank;
    private Engine engine;
    private ElectricalSystem electricalSystem;
    private Headlight[] headlights;
    private String country;

    protected Car(String model) {
        this.model = model;
        this.isMoving = false;
    }

    public void start() throws StartCarException {
        if (checkComponents()) {
            isMoving = true;
            System.out.println("Машина начала движение.");
        } else {
            throw new StartCarException(startFailReason());
        }
    }

    public void stop() {
        isMoving = false;
        System.out.println("Машина остановилась.");
    }

    public void turnHeadlights() {
        for (Headlight headlight : headlights) {
            headlight.turnOn();
        }
        System.out.println("фары включены");
    }

    private String startFailReason() {
        StringBuilder reason = new StringBuilder();

        if (!checkWheels()) {
            reason.append("Проблема с колесом. ");
        }

        if (!checkFuelTank()) {
            reason.append("Пустой бензобак. ");
        }

        if (!checkElectricalSystem()) {
            reason.append("Неисправная электрика. ");
        }

        if (!checkEngine()) {
            reason.append("Неисправный двигатель. ");
        }

        return reason.toString().trim();
    }

    private boolean checkComponents() {
        return (checkWheels() && checkFuelTank() && checkElectricalSystem() && checkEngine());
    }

    private boolean checkEngine() {
        return engine.isFine();
    }

    private boolean checkElectricalSystem() {
        return electricalSystem.isFine();
    }

    private boolean checkFuelTank() {
        return (fuelTank.getFuelLevel() != EMPTY_FUEL_TANK);
    }

    private boolean checkWheels() {
        for (Wheel wheel : wheels) {
            if (wheel == null || wheel.isPunctured()) {
                return false;
            }
        }
        return true;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setElectricalSystem(ElectricalSystem electricalSystem) {
        this.electricalSystem = electricalSystem;
    }

    public void setHeadlights(Headlight[] headlights) {
        this.headlights = headlights;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public ElectricalSystem getElectricalSystem() {
        return electricalSystem;
    }

    public Headlight[] getHeadlights() {
        return headlights;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "{model='" + model + '\'' +
                '}';
    }
}