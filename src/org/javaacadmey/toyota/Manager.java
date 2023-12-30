package org.javaacadmey.toyota;

import org.javaacadmey.toyota.model.*;
import org.javaacadmey.toyota.type.Car;

public class Manager {
    public Manager() {
        System.out.println("Менеджера ожидает нового покупателя, и за его сумму предлагает купить машину.");
    }

    public Car sellCarr(Buyer buyer) {
        double budget = buyer.getMoney();
        if (budget >= Catalog.DYNA.getCost()) {
            if (Warehouse.getCamryCount() != 0)
                return new Dyna();
        } else if (budget >= Catalog.HIANCE.getCost()) {
            return new Hiance();
        } else if (budget >= Catalog.SOLARA.getCost()) {
            return new Solara();
        } else if (budget >= Catalog.CAMRY.getCost()) {
            return new Camry();
        } else {
            System.out.println("Ты бомж");
            return null;
        }
        return null;
    }
}

