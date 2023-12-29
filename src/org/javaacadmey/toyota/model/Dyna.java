package org.javaacadmey.toyota.model;

import org.javaacadmey.toyota.components.*;
import org.javaacadmey.toyota.type.*;

import static org.javaacadmey.toyota.components.Transmission.AUTO;
import static org.javaacadmey.toyota.components.Transmission.ROBOT;

public class Dyna extends CargoVan {
    public static final int WHEEL_DIAMETER = 20;
    public static final Transmission TRANSMISSION = ROBOT;
    public static final String MODEL = "DYNA";
    private PowerSocket socket;

    public Dyna() {
        super(MODEL);
    }

    public void chargePhone(Phone phone) {
        socket.chargePhone(phone);
        System.out.println("Телефон заряжен!");
    }
}
