package org.javaacadmey.toyota.type;

import org.javaacadmey.toyota.components.*;
import org.javaacadmey.toyota.exception.StartCarException;

import java.util.Arrays;

public abstract class Car {
    private static final int EMPTY_FUEL_TANK = 0;

    private final String model;
    private Double price;
    private String color;
    private int maxSpeed;
    private boolean isMoving = false;

    private Transmission transmission;
    private Wheel[] wheels;
    private FuelTank fuelTank;
    private Engine engine;
    private ElectricalSystem electricalSystem;
    private Headlight[] headlights;
    private String country;

    protected Car(String model) {
        this.model = model;
    }

    // Начать движение
    public void start() throws StartCarException {
        if (checkComponents()) {
            isMoving = true;
            System.out.println("Машина начала движение.");
        } else {
            throw new StartCarException(StartFailReason());
        }
    }

    // Остановить движение
    public void stop() {
        isMoving = false;
        System.out.println("Машина остановилась.");
    }

    // Включить фары
    public void turnHeadlights() {
        for (Headlight headlight : headlights) {
            headlight.turnOn();
        }
        System.out.println("фары включены");
    }

    //причина невозможности движения
    private String StartFailReason() {
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

        return reason.toString();
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

    public String getCountry() {
        return country;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ElectricalSystem getElectricalSystem() {
        return electricalSystem;
    }

    public void setElectricalSystem(ElectricalSystem electricalSystem) {
        this.electricalSystem = electricalSystem;
    }

    public Headlight[] getHeadlights() {
        return headlights;
    }

    public void setHeadlights(Headlight[] headlights) {
        this.headlights = headlights;
    }

    @Override
    public String toString() {
        return "{model='" + model + '\'' +
                '}';
    }
}