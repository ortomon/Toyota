package org.javaacadmey.toyota;

import org.javaacadmey.toyota.type.Car;

public class Cashier {
    public static double income = 0;

    public void totalIncome(Car car) {
        if (car != null) {
            double carCost = car.getPrice();
            income += carCost;
        }
    }

    public void printIncome() {
        System.out.println("Общий доход кассы: " + income);
    }
}
