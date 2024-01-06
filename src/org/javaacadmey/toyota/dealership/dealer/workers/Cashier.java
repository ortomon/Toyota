package org.javaacadmey.toyota.dealership.dealer.workers;

import org.javaacadmey.toyota.vehicles.types.Car;

public class Cashier {
    public static double income = 0;

    public void totalIncome(Car car) {
        if (car != null) {
            double carCost = car.getPrice();
            income += carCost;
        }
    }

    public void printIncome() {
        System.out.println("Кассир: Общий доход кассы: " + income);
    }
}
