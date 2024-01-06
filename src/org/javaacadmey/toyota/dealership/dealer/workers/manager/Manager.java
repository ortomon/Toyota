package org.javaacadmey.toyota.dealership.dealer.workers.manager;

import org.javaacadmey.toyota.dealership.dealer.Catalog;
import org.javaacadmey.toyota.dealership.dealer.Color;
import org.javaacadmey.toyota.dealership.buyer.Buyer;
import org.javaacadmey.toyota.dealership.dealer.Dealer;
import org.javaacadmey.toyota.production.Warehouse;
import org.javaacadmey.toyota.vehicles.types.Car;

import java.io.FileWriter;
import java.io.IOException;

public class Manager {
    private static final int NO_CARS_IN_WAREHOUSE = 0;

    private String name;
    private Report report;

    public Manager(String name) {
        this.name = name;
        this.report = new Report(name);
    }

    public void generateReport() throws IOException {
        String reportFile = "report.txt";

        try (FileWriter fileWriter = new FileWriter(reportFile, true)) {
            fileWriter.write(report.report());
        }
    }

    public Car sellCar(Buyer buyer, Warehouse warehouse, Dealer dealer) {
        double budget = buyer.getMoney();

        if (budget >= Catalog.DYNA.getCost()) {
            return sellCar(warehouse, Catalog.DYNA, dealer, Color.BLACK);
        } else if (budget >= Catalog.HIANCE.getCost()) {
            return sellCar(warehouse, Catalog.HIANCE, dealer, Color.BLACK);
        } else if (budget >= Catalog.SOLARA.getCost()) {
            return sellCar(warehouse, Catalog.SOLARA, dealer, Color.WHITE);
        } else if (budget >= Catalog.CAMRY.getCost()) {
            return sellCar(warehouse, Catalog.CAMRY, dealer, Color.BLACK);
        } else {
            System.out.println("Менеджер: Ты бомж! Охрана!");
            return null;
        }
    }

    private Car sellCar(Warehouse warehouse, Catalog catalog, Dealer dealer, Color Color) {
        if (warehouse.getCountCarsOfModel(catalog.getModel()) != NO_CARS_IN_WAREHOUSE) {
            return sellCar(warehouse, catalog);
        } else {
            dealer.requestAssemblyAndProduction(catalog.getModel(), Color, catalog.getCost());
            return sellCar(warehouse, catalog);
        }
    }

    private Car sellCar(Warehouse warehouse, Catalog catalog) {
        Car soldCar = warehouse.extractCar(catalog.getModel());
        report.addCar(catalog.getModel(), catalog.getCost(), catalog.getCostPrice());
        return soldCar;
    }
}