package org.javaacadmey.toyota.vehicles.components;

public enum Transmission {
    AUTO("акпп"),
    MANUAL("механика"),
    ROBOT("робот");

    private final String type;

    Transmission(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
