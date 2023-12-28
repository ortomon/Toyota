package model;

import components.Phone;
import components.PowerSocket;
import type.CargoVan;

public class Dyna extends CargoVan {
    private static final int WHEEL_DIAMETER = 20;
    private static final String MODEL = "DYNA";
    private PowerSocket socket;

    protected Dyna() {
        super(MODEL);
    }

    public void chargePhone(Phone phone) {
        socket.chargePhone(phone);
        System.out.println("Телефон заряжен!");
    }
}
