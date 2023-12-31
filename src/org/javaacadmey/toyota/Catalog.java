package org.javaacadmey.toyota;

public enum Catalog {
    CAMRY(5000, 10000),
    SOLARA(8000, 12000),
    HIANCE(10000, 15000),
    DYNA(12000, 22000);

    private final double costPrice;
    private final double cost;

    Catalog(double costPrice, double cost) {
        this.costPrice = costPrice;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public double getCostPrice() {
        return costPrice;
    }
}
