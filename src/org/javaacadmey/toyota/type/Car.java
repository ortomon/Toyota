package org.javaacadmey.toyota.type;

import org.javaacadmey.toyota.components.*;
import java.util.Arrays;

public abstract class Car {
    private static final int EMPTY_FUEL_TANK = 0;

    private final String model;
    private Double price;
    private String color;
    private int maxSpeed;
    private Transmission transmission; // тип коробки передач
    private boolean isMoving = false; // true - в состоянии движения, false - нет

    private Wheel[] wheels;
    private FuelTank fuelTank; // бензобак
    private Engine engine; // двигатель
    private ElectricalSystem electricalSystem; // электрика
    private Headlight[] headlights; //фары

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

    @Override
    public String toString() {
        return "org.javaacadmey.toyota.type.Car{" +
                "org.javaacadmey.toyota.model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", inMotion=" + isMoving +
                ", wheels=" + Arrays.toString(wheels) +
                ", fuelTank=" + fuelTank +
                ", engine=" + engine +
                ", electricalSystem=" + electricalSystem +
                ", headlights=" + Arrays.toString(headlights) +
                '}';
    }
}