package org.javaacadmey.toyota.vehicles.exceptions;

public class NegativeFuelLevelException extends RuntimeException {
    public NegativeFuelLevelException() {
        super("Ошибка: количество топлива не может быть отрицательным!");
    }
}
