package org.javaacadmey.toyota.dealership;

public class Buyer {
    private String name;
    private double money;

    public Buyer(double money) {
        this.money = money;
    }

    public Buyer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Buyer{" +
                " money=" + money +
                '}';
    }
}
