package org.javaacadmey.toyota.vehicles.exception;

public class NegativeFuelLevelException extends RuntimeException {
    public NegativeFuelLevelException() {
        super("Ошибка: количество топлива не может быть отрицательным!");
    }
}
