package org.javaacadmey.toyota.components;

/**
 * Каждое колесо имеет состояние - проколото или нет, диаметр (camry - 17, solara - 16,
 *  * hiance - 20, dyna - 20). Колеса могуть быть заменяемы если они одинакового диаметра.
 */

public class Wheel {
    private boolean isPunctured; // true - проколото, false - нет
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
        return "org.javaacadmey.toyota.components.Wheel{" +
                "isPunctured=" + isPunctured +
                ", diameter=" + diameter +
                '}';
    }
}
