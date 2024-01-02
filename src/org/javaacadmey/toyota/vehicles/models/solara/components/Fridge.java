package org.javaacadmey.toyota.vehicles.models.solara.components;

public class Fridge {
    public void cool(Drink drink) {
        drink.setCold(true);
        System.out.println("Напиток охлажден!");
    }
}
