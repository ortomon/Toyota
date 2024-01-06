package org.javaacadmey.toyota.vehicles.models;

import org.javaacadmey.toyota.vehicles.components.*;
import org.javaacadmey.toyota.vehicles.components.Phone;
import org.javaacadmey.toyota.vehicles.components.PowerSocket;
import org.javaacadmey.toyota.vehicles.types.*;

import static org.javaacadmey.toyota.vehicles.components.Transmission.ROBOT;

public class Dyna extends CargoVan {
    public static final int WHEEL_DIAMETER = 20;
    public static final int CARGO_CAPACITY = 1000;
    public static final int MAX_SPEED = 400;
    public static final Transmission TRANSMISSION = ROBOT;
    public static final String MODEL = "dyna";

    private PowerSocket socket;

    public Dyna() {
        super(MODEL);
    }

    public void chargePhone(Phone phone) {
        socket.chargePhone(phone);
        System.out.println("Телефон заряжен!");
    }

    public PowerSocket getSocket() {
        return socket;
    }

    public void setSocket(PowerSocket socket) {
        this.socket = socket;
    }
}
