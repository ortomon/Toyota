package org.javaacadmey.toyota.production;

import org.javaacadmey.toyota.dealership.dealer.Catalog;
import org.javaacadmey.toyota.dealership.dealer.Color;
import org.javaacadmey.toyota.vehicles.models.Camry;
import org.javaacadmey.toyota.vehicles.models.Dyna;
import org.javaacadmey.toyota.vehicles.models.Hiance;
import org.javaacadmey.toyota.vehicles.models.Solara;
import org.javaacadmey.toyota.vehicles.types.*;

import java.io.IOException;
import java.util.Arrays;

public class Warehouse {
    private static final int MAX_CAPACITY = 1000;
    private int totalCountCars;

    private int camryCount;
    private int solaraCount;
    private int hianceCount;
    private int dynaCount;

    private Camry[] camryCars = new Camry[MAX_CAPACITY];
    private Solara[] solaraCars = new Solara[MAX_CAPACITY];
    private Hiance[] hianceCars = new Hiance[MAX_CAPACITY];
    private Dyna[] dynaCars = new Dyna[MAX_CAPACITY];

    public Car extractCar(String model) {
        switch (model) {
            case Camry.MODEL:
                if (checkCountCarModel(camryCount)) {
                    camryCount--;
                    return extractCar(camryCars);
                }
            case Solara.MODEL:
                if (checkCountCarModel(solaraCount)) {
                    solaraCount--;
                    return extractCar(solaraCars);
                }
            case Hiance.MODEL:
                if (checkCountCarModel(hianceCount)) {
                    hianceCount--;
                    return extractCar(hianceCars);
                }
            case Dyna.MODEL:
                if (checkCountCarModel(dynaCount)) {
                    dynaCount--;
                    return extractCar(dynaCars);
                }
            default:
                System.out.println("Модель не распознана.");
                return null;
        }
    }

    private boolean checkCountCarModel(int carsCount) {
        return (carsCount > 0);
    }

    private Car extractCar(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                Car car = cars[i];
                cars[i] = null;
                totalCountCars--;
                return car;
            }
        }
        System.out.println("Нет доступных машин указанной модели на складе.");
        return null;
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
