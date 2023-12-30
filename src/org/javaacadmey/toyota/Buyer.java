package org.javaacadmey.toyota;

public class Buyer {
    private String name;
    private double money;

    public Buyer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
