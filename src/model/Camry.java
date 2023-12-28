package model;

public class Camry extends Sedan {
    private static final int WHEEL_DIAMETER = 17;
    private static final String MODEL = "CAMRY";
    private USB usb;

    public Camry() {
        super(MODEL);
    }

    public void connectMusic() {
       usb.connect();
       System.out.println("components.USB подключен для проигрывания музыки.");
    }

    public void disconnectMusic() {
        usb.disconnect();
        System.out.println("components.USB подключен для проигрывания музыки.");
    }
}
