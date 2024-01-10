package org.javaacadmey.toyota.vehicles.models;

import org.javaacadmey.toyota.vehicles.components.*;
import org.javaacadmey.toyota.dealership.buyer.stuff.Drink;
import org.javaacadmey.toyota.vehicles.components.Fridge;
import org.javaacadmey.toyota.vehicles.types.*;

import static org.javaacadmey.toyota.vehicles.components.Transmission.AUTO;

public class Solara extends Cabriolet {
    public static final int WHEEL_DIAMETER = 16;
    public static final int MAX_SPEED = 200;
    public static final Transmission TRANSMISSION = AUTO;
    public static final String MODEL = "solara";
    private Fridge fridge;

    public Solara() {
        super(MODEL);
    }

    public void cool(Drink drink) {
        fridge.cool(drink);
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }
}
