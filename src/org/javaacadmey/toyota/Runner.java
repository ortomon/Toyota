package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountryFactoryNotEqualException;
import org.javaacadmey.toyota.exception.StartCarException;
import org.javaacadmey.toyota.model.*;
import org.javaacadmey.toyota.production.*;

public class Runner {
    public static void main(String[] args) throws CountryFactoryNotEqualException {

        Factory japanFactory = new Factory("Japan");
        AssemblyLine japanAssemblyLine = new AssemblyLine("Japan", japanFactory);
        Warehouse japanWarehouse = new Warehouse();
        Dealer dealer = new Dealer();

        Camry camry = japanAssemblyLine.createCamry("black", 10000);
        Solara solara = japanAssemblyLine.createSolara("white", 12000);
        Hiance hiance = japanAssemblyLine.createHiance("black", 15000);
        Dyna dyna = japanAssemblyLine.createDyna("black", 22000);

        japanWarehouse.addCar(camry);
        japanWarehouse.addCar(solara);
        japanWarehouse.addCar(hiance);
        japanWarehouse.addCar(dyna);
    }
}
