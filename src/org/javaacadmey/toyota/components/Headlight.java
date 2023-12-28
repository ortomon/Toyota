package org.javaacadmey.toyota.components;

/**
 * Фары имеют атрибут - работоспособны
 */
public class Headlight {
    private boolean areOn;

    public Headlight() {
        this.areOn = false;
    }

    public boolean isAreOn() {
        return areOn;
    }

    public void turnOn() {
        this.areOn = true;
    }

    public void turnOff() {
        this.areOn = false;
    }

    @Override
    public String toString() {
        return "org.javaacadmey.toyota.components.Headlight{" +
                "isFine=" + areOn +
                '}';
    }
}
