package org.javaacadmey.toyota.production.exceptions;

public class CountryFactoryNotEqualException extends Exception {
    public CountryFactoryNotEqualException(String message) {
        super("Страны фабрики производства и конвейера не совпадают: " + message);
    }
}
