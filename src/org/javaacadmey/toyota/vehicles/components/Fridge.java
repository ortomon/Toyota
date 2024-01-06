package org.javaacadmey.toyota.vehicles.components;

import org.javaacadmey.toyota.dealership.buyer.stuff.Drink;

public class Fridge {
    public void cool(Drink drink) {
        drink.setCold(true);
        System.out.println("Напиток охлажден!");
    }
}
