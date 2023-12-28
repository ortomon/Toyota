package model;

import components.*;
import type.*;

public class Hiance extends CargoVan {
    private static final int WHEEL_DIAMETER = 20;
    private static final String MODEL = "HIANCE";
    private Wheel replacementWheel;

    public Hiance() {
        super(MODEL);
    }
}
