package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountryFactoryNotEqualException;
import org.javaacadmey.toyota.production.AssemblyLine;
import org.javaacadmey.toyota.production.Factory;

public class Dealer {
    private Factory factory;
    private AssemblyLine assemblyLine;
    private Warehouse warehouse;
    private Manager manager;
    private Cashier cashier;

    public Dealer(Factory factory, AssemblyLine assemblyLine, Warehouse warehouse, Manager manager, Cashier cashier) {
        this.factory = factory;
        this.assemblyLine = assemblyLine;
        this.warehouse = warehouse;
        this.manager = manager;
        this.cashier = cashier;
    }

    public void initialize() {
        warehouse.addCar(assemblyLine.createCamry("black", Catalog.CAMRY.getCost()));
        warehouse.addCar(assemblyLine.createSolara("white", Catalog.SOLARA.getCost()));
        warehouse.addCar(assemblyLine.createHiance("black", Catalog.HIANCE.getCost()));
        warehouse.addCar(assemblyLine.createDyna("black", Catalog.DYNA.getCost()));

    }

    public Manager getManager() {
        return manager;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public AssemblyLine getAssemblyLine() {
        return assemblyLine;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "factory=" + factory +
                ", assemblyLine=" + assemblyLine +
                ", warehouse=" + warehouse +
                ", manager=" + manager +
                ", cashier=" + cashier +
                '}';
    }
}
