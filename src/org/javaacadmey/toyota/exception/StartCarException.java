package org.javaacadmey.toyota.exception;

public class StartCarException extends Exception {
    public StartCarException(String message) {
        super("Невозможно начать движение. Причина: " + message);
    }
}
