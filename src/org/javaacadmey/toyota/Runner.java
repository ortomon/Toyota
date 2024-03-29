package org.javaacadmey.toyota;

import org.javaacadmey.toyota.dealership.buyer.Buyer;
import org.javaacadmey.toyota.dealership.dealer.workers.Cashier;
import org.javaacadmey.toyota.dealership.dealer.Dealer;
import org.javaacadmey.toyota.dealership.dealer.workers.manager.Manager;
import org.javaacadmey.toyota.production.*;
import org.javaacadmey.toyota.vehicles.types.Car;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Factory japanFactory = new Factory("Japan");
        AssemblyLine japanAssemblyLine = new AssemblyLine("Japan", japanFactory);

        Dealer dealer = new Dealer(
                japanFactory,
                japanAssemblyLine,
                new Warehouse(),
                new Manager("моргенштерн"),
                new Cashier());

        dealer.addCarsToWarehouse();

        Buyer[] firstDayBuyers = {
                new Buyer(10000),
                new Buyer(12000),
                new Buyer(15000),
                new Buyer(22000),
                new Buyer(11000),
                new Buyer(13000),
                new Buyer(8000),
                new Buyer(30000),
        };

        for (Buyer buyer : firstDayBuyers) {
            Car car = dealer.getManager().sellCar(buyer, dealer.getWarehouse(), dealer);
            dealer.getCashier().totalIncome(car);
        }

        dealer.getCashier().printIncome();
        dealer.getManager().generateReport();
    }
}
