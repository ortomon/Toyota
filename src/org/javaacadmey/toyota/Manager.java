package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountryFactoryNotEqualException;
import org.javaacadmey.toyota.model.*;
import org.javaacadmey.toyota.production.AssemblyLine;
import org.javaacadmey.toyota.type.Car;

public class Manager {
    private String name;
    public Manager() {
        System.out.println("Менеджер ожидает нового покупателя.");
    }

    public Car sellCar(Buyer buyer, Warehouse warehouse, AssemblyLine assemblyLine) {
        double budget = buyer.getMoney();

        if (budget >= Catalog.DYNA.getCost()) {
            if (warehouse.getDynaCount() != 0) {
                return warehouse.takeCar(Dyna.MODEL);
            } else {
                warehouse.addCar(assemblyLine.createDyna("black", Catalog.DYNA.getCost()));
                return warehouse.takeCar(Dyna.MODEL);
            }
        } else if (budget >= Catalog.HIANCE.getCost()) {
            if (warehouse.getHianceCount() != 0) {
                return warehouse.takeCar(Hiance.MODEL);
            } else {
                warehouse.addCar(assemblyLine.createHiance("black", Catalog.HIANCE.getCost()));
                return warehouse.takeCar(Hiance.MODEL);
            }
        } else if (budget >= Catalog.SOLARA.getCost()) {
            if (warehouse.getSolaraCount() != 0) {
                return warehouse.takeCar(Solara.MODEL);
            } else {
                warehouse.addCar(assemblyLine.createSolara("white", Catalog.SOLARA.getCost()));
                return warehouse.takeCar(Solara.MODEL);
            }
        } else if (budget >= Catalog.CAMRY.getCost()) {
            if (warehouse.getCamryCount() != 0) {
                return warehouse.takeCar(Camry.MODEL);
            } else {
                warehouse.addCar(assemblyLine.createCamry("black", Catalog.CAMRY.getCost()));
                return warehouse.takeCar(Camry.MODEL);
            }
        } else {
            System.out.println(buyer.getName() + " Ты бомж");
            return null;
        }
    }
}