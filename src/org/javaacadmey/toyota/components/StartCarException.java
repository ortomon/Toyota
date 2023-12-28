package org.javaacadmey.toyota.components;

public class StartCarException extends Exception {
    public StartCarException(String message) {
        super("Невозможно начать движение. Причина: " + message);
    }
}
