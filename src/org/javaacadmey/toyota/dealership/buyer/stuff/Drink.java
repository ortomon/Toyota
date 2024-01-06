package org.javaacadmey.toyota.dealership.buyer.stuff;

public class Drink {
    private String name;
    private boolean isCold;

    public Drink(String name, boolean isCold) {
        this.name = name;
        this.isCold = isCold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }
}
