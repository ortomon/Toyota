package org.javaacadmey.toyota;

import org.javaacadmey.toyota.model.Camry;
import org.javaacadmey.toyota.model.Dyna;
import org.javaacadmey.toyota.model.Hiance;
import org.javaacadmey.toyota.model.Solara;
import org.javaacadmey.toyota.type.Car;

public enum Catalog {
    CAMRY(5000, 10000, Camry.MODEL),
    SOLARA(8000, 12000, Solara.MODEL),
    HIANCE(10000, 15000, Hiance.MODEL),
    DYNA(12000, 22000, Dyna.MODEL);

    private final double costPrice;
    private final double cost;
    private final String model;

    Catalog(double costPrice, double cost, String model) {
        this.costPrice = costPrice;
        this.cost = cost;
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public String getModel() {
        return model;
    }
}
