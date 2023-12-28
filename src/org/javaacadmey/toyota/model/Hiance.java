package org.javaacadmey.toyota.model;

import org.javaacadmey.toyota.components.*;
import org.javaacadmey.toyota.type.*;

public class Hiance extends CargoVan {
    private static final int WHEEL_DIAMETER = 20;
    private static final String MODEL = "HIANCE";
    private Wheel replacementWheel;

    public Hiance() {
        super(MODEL);
    }
}
