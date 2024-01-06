package org.javaacadmey.toyota.vehicles.types;

import org.javaacadmey.toyota.vehicles.components.CruiseControl;

public abstract class Sedan extends Car {
    private CruiseControl cruiseControl;

    protected Sedan(String model) {
        super(model);
    }

    public CruiseControl getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(CruiseControl cruiseControl) {
        this.cruiseControl = cruiseControl;
    }
}
