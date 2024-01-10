package org.javaacadmey.toyota.vehicles.models;

import org.javaacadmey.toyota.vehicles.components.*;
import org.javaacadmey.toyota.vehicles.types.*;

import static org.javaacadmey.toyota.vehicles.components.Transmission.MANUAL;

public class Hiance extends CargoVan {
    public static final int WHEEL_DIAMETER = 20;
    public static final int CARGO_CAPACITY = 500;
    public static final int MAX_SPEED = 100;
    public static final Transmission TRANSMISSION = MANUAL;
    public static final String MODEL = "hiance";
    private Wheel replacementWheel;

    public Hiance() {
        super(MODEL);
    }

    public Wheel getReplacementWheel() {
        return replacementWheel;
    }

    public void setReplacementWheel(Wheel replacementWheel) {
        this.replacementWheel = replacementWheel;
    }
}
