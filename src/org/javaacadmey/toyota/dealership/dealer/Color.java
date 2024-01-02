package org.javaacadmey.toyota.dealership.dealer;

public enum Color {
    BLACK("black"),
    WHITE("white");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
