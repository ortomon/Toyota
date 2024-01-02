package org.javaacadmey.toyota.vehicles.models.camry;

import org.javaacadmey.toyota.vehicles.components.*;
import org.javaacadmey.toyota.vehicles.models.camry.components.USB;
import org.javaacadmey.toyota.vehicles.types.*;

import static org.javaacadmey.toyota.vehicles.components.Transmission.AUTO;

public class Camry extends Sedan {
    public static final int WHEEL_DIAMETER = 17;
    public static final Transmission TRANSMISSION = AUTO;
    public static final String MODEL = "camry";
    private USB usb;

    public Camry() {
        super(MODEL);
    }

    public void connectMusic() {
       usb.connect();
       System.out.println("USB подключен для проигрывания музыки.");
    }

    public void disconnectMusic() {
        usb.disconnect();
        System.out.println("USB отключен");
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }
}
