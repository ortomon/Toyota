package org.javaacadmey.toyota;

import org.javaacadmey.toyota.model.*;
import org.javaacadmey.toyota.type.*;
import java.util.Arrays;

public class Warehouse {
    private int totalCountCars;
    private static final int MAX_CAPACITY = 1000;

    private int camryCount;
    private int solaraCount;
    private int hianceCount;
    private int dynaCount;

    private Camry[] camryCars;
    private Solara[] solaraCars;
    private Hiance[] hianceCars;
    private Dyna[] dynaCars;

    public Warehouse() {
        this.totalCountCars = 0;
        this.camryCount = 0;
        this.solaraCount = 0;
        this.hianceCount = 0;
        this.dynaCount = 0;

        this.camryCars = new Camry[MAX_CAPACITY];
        this.solaraCars = new Solara[MAX_CAPACITY];
        this.hianceCars = new Hiance[MAX_CAPACITY];
        this.dynaCars = new Dyna[MAX_CAPACITY];
    }

    public Car takeCar(String model) {
        switch (model) {
            case Camry.MODEL:
                camryCount--;
                camryCars = Arrays.copyOf(camryCars, camryCars.length - 1);
                return takeCar(camryCars);
            case Solara.MODEL:
                solaraCount--;
                solaraCars = Arrays.copyOf(solaraCars, solaraCars.length - 1);
                return takeCar(solaraCars);
            case Hiance.MODEL:
                hianceCount--;
                hianceCars = Arrays.copyOf(hianceCars, hianceCars.length - 1);
                return takeCar(hianceCars);
            case Dyna.MODEL:
                dynaCount--;
                dynaCars = Arrays.copyOf(dynaCars, dynaCars.length - 1);
                return takeCar(dynaCars);
            default:
                System.out.println("Модель не распознана.");
                return null;
        }
    }

    private Car takeCar(Car[] cars) {
        if (cars.length > 0) {
            Car car = cars[0];
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

    public int getCountCarsOfModel(String model) {
        switch (model) {
            case Camry.MODEL:
                return getCamryCount();
            case Solara.MODEL:
                return getSolaraCount();
            case Hiance.MODEL:
                return getHianceCount();
            case Dyna.MODEL:
                return getDynaCount();
            default:
                System.out.println("Модель не распознана.");
                return 0;
        }
    }

    public int getCamryCount() {
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

    @Override
    public String toString() {
        return "Warehouse{" +
                "totalCountCars=" + totalCountCars +
                ", camryCount=" + camryCount +
                ", solaraCount=" + solaraCount +
                ", hianceCount=" + hianceCount +
                ", dynaCount=" + dynaCount +
                ", camryCars=" + Arrays.toString(camryCars) +
                ", solaraCars=" + Arrays.toString(solaraCars) +
                ", hianceCars=" + Arrays.toString(hianceCars) +
                ", dynaCars=" + Arrays.toString(dynaCars) +
                '}';
    }
}
