package org.javaacadmey.toyota.model;

import org.javaacadmey.toyota.components.*;
import org.javaacadmey.toyota.type.*;

import static org.javaacadmey.toyota.components.Transmission.AUTO;
import static org.javaacadmey.toyota.components.Transmission.MANUAL;

public class Hiance extends CargoVan {
    public static final int WHEEL_DIAMETER = 20;
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
