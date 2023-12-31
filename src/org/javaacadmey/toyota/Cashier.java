package org.javaacadmey.toyota;

import org.javaacadmey.toyota.type.Car;

public class Cashier {
    public static double totalIncome = 0;

    public void totalIncome(Car car) {
        if (car != null) {
            double carCost = car.getPrice();
            totalIncome += carCost;
            System.out.println(" приобрел машину за " + carCost + ". Общий доход: " + totalIncome);
        } else {
            System.out.println(" не смог приобрести машину.");
        }
    }

    public void printTotalIncome() {
        System.out.println("Общий доход кассы: " + totalIncome);
    }
}
