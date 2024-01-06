package org.javaacadmey.toyota.dealership.buyer;

public class Buyer {
    private String name;
    private double money;

    public Buyer(double money) {
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

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                " money=" + money +
                '}';
    }
}
