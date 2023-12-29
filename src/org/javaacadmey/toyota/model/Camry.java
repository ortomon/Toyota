package org.javaacadmey.toyota.model;

import org.javaacadmey.toyota.components.*;
import org.javaacadmey.toyota.type.*;

import static org.javaacadmey.toyota.components.Transmission.AUTO;

public class Camry extends Sedan {
    public static final int WHEEL_DIAMETER = 17;
    public static final Transmission TRANSMISSION = AUTO;
    public static final String MODEL = "CAMRY";
    private USB usb;

    public Camry() {
        super(MODEL);
    }

    public void connectMusic() {
       usb.connect();
       System.out.println("org.javaacadmey.toyota.components.USB подключен для проигрывания музыки.");
    }

    public void disconnectMusic() {
        usb.disconnect();
        System.out.println("org.javaacadmey.toyota.components.USB подключен для проигрывания музыки.");
    }
}
