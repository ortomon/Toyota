package org.javaacadmey.toyota.dealership.dealer;

import org.javaacadmey.toyota.vehicles.models.Camry;
import org.javaacadmey.toyota.vehicles.models.Dyna;
import org.javaacadmey.toyota.vehicles.models.Hiance;
import org.javaacadmey.toyota.vehicles.models.Solara;

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
