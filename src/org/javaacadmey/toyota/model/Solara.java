package org.javaacadmey.toyota.model;

import org.javaacadmey.toyota.components.*;
import org.javaacadmey.toyota.type.*;

public class Solara extends Cabriolet {
    private static final int WHEEL_DIAMETER = 16;
    private static final String MODEL = "SOLARA";
    private Fridge fridge;

    public Solara() {
        super(MODEL);
    }

    public void cool(Drink drink) {
        fridge.cool(drink);
    }
}