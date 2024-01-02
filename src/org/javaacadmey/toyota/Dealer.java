package org.javaacadmey.toyota;

import org.javaacadmey.toyota.model.Camry;
import org.javaacadmey.toyota.model.Dyna;
import org.javaacadmey.toyota.model.Hiance;
import org.javaacadmey.toyota.model.Solara;
import org.javaacadmey.toyota.production.AssemblyLine;
import org.javaacadmey.toyota.production.Factory;
import org.javaacadmey.toyota.type.Car;

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
        warehouse.addCar(assemblyLine.createCar(Camry.MODEL, Color.BLACK.getColor(), Catalog.CAMRY.getCost()));
        warehouse.addCar(assemblyLine.createCar(Solara.MODEL, Color.WHITE.getColor(), Catalog.SOLARA.getCost()));
        warehouse.addCar(assemblyLine.createCar(Hiance.MODEL, Color.BLACK.getColor(), Catalog.HIANCE.getCost()));
        warehouse.addCar(assemblyLine.createCar(Dyna.MODEL, Color.BLACK.getColor(), Catalog.DYNA.getCost()));
    }

    public void requestAssemblyAndProduction(String model, Color Color, double cost) {
        warehouse.addCar(assemblyLine.createCar(model, Color.getColor(), cost));
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
