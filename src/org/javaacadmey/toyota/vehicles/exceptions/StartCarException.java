package org.javaacadmey.toyota.vehicles.exceptions;

public class StartCarException extends Exception {
    public StartCarException(String message) {
        super("Невозможно начать движение. Причина: " + message);
    }
}
