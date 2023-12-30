package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountryFactoryNotEqualException;
import org.javaacadmey.toyota.production.AssemblyLine;
import org.javaacadmey.toyota.production.Factory;

public class Dealer {
    private Factory factory;
    private AssemblyLine assemblyLine;
    private Warehouse warehouse;
    private Manager manager;

    public Dealer(Factory factory, AssemblyLine assemblyLine, Warehouse warehouse) {
        this.factory = factory;
        this.assemblyLine = assemblyLine;
        this.warehouse = warehouse;
    }

    public void initialize() {
        try {
            warehouse.addCar(assemblyLine.createCamry("black", Catalog.CAMRY.getCost()));
            warehouse.addCar(assemblyLine.createSolara("white", Catalog.SOLARA.getCost()));
            warehouse.addCar(assemblyLine.createHiance("black", Catalog.HIANCE.getCost()));
            warehouse.addCar(assemblyLine.createDyna("black", Catalog.DYNA.getCost()));
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }

}
