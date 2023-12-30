package org.javaacadmey.toyota.model;

import org.javaacadmey.toyota.components.*;
import org.javaacadmey.toyota.type.*;

import static org.javaacadmey.toyota.components.Transmission.AUTO;

public class Solara extends Cabriolet {
    public static final int WHEEL_DIAMETER = 16;
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
