package org.javaacadmey.toyota.vehicles.components;

public class Wheel {
    private boolean isPunctured;
    private final int diameter;

    public Wheel(boolean isPunctured, int diameter) {
        this.isPunctured = isPunctured;
        this.diameter = diameter;
    }

    public void replace(Wheel replacementWheel) {
        if (replacementWheel.diameter == this.diameter) {
            isPunctured = false;
            System.out.println("Колесо заменено.");
        } else {
            System.out.println("Невозможно заменить колесо. Разные диаметры.");
        }
    }

    public boolean isPunctured() {
        return isPunctured;
    }

    public void setPunctured(boolean punctured) {
        isPunctured = punctured;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "isPunctured=" + isPunctured +
                ", diameter=" + diameter +
                '}';
    }
}
