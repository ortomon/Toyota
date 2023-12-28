package type;

public abstract class Sedan extends Car {
    private boolean cruiseControlWork;

    protected Sedan(String model) {
        super(model);
    }

    public boolean isCruiseControlWork() {
        return cruiseControlWork;
    }

    public void cruiseControlTurnOn() {
        cruiseControlWork = true;
        System.out.println("Круиз-контроль включен.");
    }

    public void cruiseControlTurnOff() {
        cruiseControlWork = false;
        System.out.println("Круиз-контроль выключен.");
    }
}
