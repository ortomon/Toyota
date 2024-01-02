package org.javaacadmey.toyota.dealership.dealer.workers.manager;

import org.javaacadmey.toyota.dealership.dealer.workers.Cashier;

import java.util.Arrays;

public class Report {
    private String managerName;
    private String[] soldCars;
    private int numberSoldCar;

    private double income; // доходы - (сумма всех продаж),
    private double expenses; // расходы (сумма всех себестоимостей),
    private double profit; // прибыль - (доходы - расходы)

    public Report(String managerName) {
        this.managerName = managerName;
        this.soldCars = new String[0];
        this.numberSoldCar = 0;
        this.income = 0;
        this.profit = 0;
        this.expenses = 0;
    }

    public void addCar(String model, double cost, double costPrice) {
        numberSoldCar++;
        String carInfo = String.format("Модель №%d %s - стоимость продажи: %.2f - себестоимость: %.2f",
                numberSoldCar, model, cost, costPrice);

        String[] newSoldCars = new String[soldCars.length + 1];
        System.arraycopy(soldCars, 0, newSoldCars, 0, soldCars.length);
        newSoldCars[soldCars.length] = carInfo;

        income += cost;
        expenses += costPrice;
        profit = income - expenses;

        soldCars = newSoldCars;
    }

    public String[] getSoldCars() {
        return soldCars;
    }

    public double getIncome() {
        return income;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getProfit() {
        return profit;
    }

    public String report() {
        StringBuilder report = new StringBuilder();
        report.append(String.format("\nИмя менеджера: %s\n\n", managerName));

        for (String soldCar : soldCars) {
            report.append(soldCar).append("\n");
        }

        report.append("--------------------------------------------------------------------------\n");
        report.append("Итог:" + "\n");
        report.append(String.format("Доходы - " + income + "\n"));
        report.append(String.format("Расходы - " + expenses + "\n"));
        report.append(String.format("Прибыль - " + profit + "\n"));
        report.append("--------------------------------------------------------------------------\n");

        return report.toString();
    }
}
