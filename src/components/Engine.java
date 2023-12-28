package components;

/**
 * Двигатель имеет атрибут - работоспособен
 */

public class Engine {
    private boolean isFine;

    public Engine(boolean isFine) {
        this.isFine = isFine;
    }

    public boolean isFine() {
        return isFine;
    }

    public void setFine(boolean fine) {
        isFine = fine;
    }

    @Override
    public String toString() {
        return "components.Engine{" +
                "isFine=" + isFine +
                '}';
    }
}
