package org.javaacadmey.toyota;

import org.javaacadmey.toyota.model.*;
import org.javaacadmey.toyota.type.*;
import java.util.Arrays;

public class Warehouse {
    private int totalCountCars;
    private static final int MAX_CAPACITY = 1000;

    private static int camryCount;
    private int solaraCount;
    private int hianceCount;
    private int dynaCount;

    private static Camry[] camryCars;
    private Solara[] solaraCars;
    private Hiance[] hianceCars;
    private Dyna[] dynaCars;

    public Warehouse() {
        this.totalCountCars = 0;
        this.camryCount = 0;
        this.solaraCount = 0;
        this.hianceCount = 0;
        this.dynaCount = 0;
    }

    public Car takeCar(String model) {
        switch (model) {
            case Camry.MODEL:
                camryCount--;
                return takeCar(camryCars);
            case Solara.MODEL:
                solaraCount--;
                return takeCar(solaraCars);
            case Hiance.MODEL:
                hianceCount--;
                return takeCar(hianceCars);
            case Dyna.MODEL:
                dynaCount--;
                return takeCar(dynaCars);
            default:
                System.out.println("Модель не распознана.");
                return null;
        }
    }

    private Car takeCar(Car[] cars) {
        if (cars.length > 0) {
            Car car = cars[cars.length - 1];
            cars = Arrays.copyOf(cars, cars.length - 1);
            totalCountCars--;
            return car;
        } else {
            System.out.println("Нет доступных машин указанной модели на складе.");
            return null;
        }
    }

    public void addCar(Car car) {
        switch (car.getModel()) {
            case Camry.MODEL:
                addCar(car, camryCars, camryCount++);
                break;
            case Solara.MODEL:
                addCar(car, solaraCars, solaraCount++);
                break;
            case Hiance.MODEL:
                addCar(car, hianceCars, hianceCount++);
                break;
            case Dyna.MODEL:
                addCar(car, dynaCars, dynaCount++);
                break;
            default:
                System.out.println("Модель не распознана.");
        }
    }

    private void addCar(Car car, Car[] cars, int count) {
        if (totalCountCars < MAX_CAPACITY) {
            cars[count] = car;
            totalCountCars++;
        } else {
            System.out.println("Достигнуто максимальное количество машин на складе.");
        }
    }

    public int getTotalCountCars() {
        return totalCountCars;
    }

    public static int getCamryCount() {
        return camryCount;
    }

    public int getSolaraCount() {
        return solaraCount;
    }

    public int getHianceCount() {
        return hianceCount;
    }

    public int getDynaCount() {
        return dynaCount;
    }

    public static Camry[] getCamryCars() {
        return camryCars;
    }

    public Solara[] getSolaraCars() {
        return solaraCars;
    }

    public Hiance[] getHianceCars() {
        return hianceCars;
    }

    public Dyna[] getDynaCars() {
        return dynaCars;
    }
}
