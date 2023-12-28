package model;

import components.Wheel;
import type.CargoVan;

public class Hiance extends CargoVan {
    private static final int WHEEL_DIAMETER = 20;
    private static final String MODEL = "HIANCE";
    private Wheel replacementWheel;

    public Hiance() {
        super(MODEL);
    }
}
