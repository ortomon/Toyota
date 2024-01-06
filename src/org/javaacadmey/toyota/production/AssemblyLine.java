package org.javaacadmey.toyota.production;

import org.javaacadmey.toyota.production.exceptions.CountryFactoryNotEqualException;
import org.javaacadmey.toyota.vehicles.components.CruiseControl;
import org.javaacadmey.toyota.vehicles.components.Transmission;
import org.javaacadmey.toyota.vehicles.models.Camry;
import org.javaacadmey.toyota.vehicles.components.USB;
import org.javaacadmey.toyota.vehicles.models.Dyna;
import org.javaacadmey.toyota.vehicles.components.PowerSocket;
import org.javaacadmey.toyota.vehicles.models.Hiance;
import org.javaacadmey.toyota.vehicles.components.Fridge;
import org.javaacadmey.toyota.vehicles.models.Solara;
import org.javaacadmey.toyota.vehicles.types.*;

public class AssemblyLine {
    private final String country;
    private final Factory factory;

    public AssemblyLine(String country, Factory factory) {
        this.country = country;
        this.factory = factory;
    }

    private void checkCountryEquality() throws CountryFactoryNotEqualException {
        if (!factory.getCountry().equals(country)) {
            throw new CountryFactoryNotEqualException(factory.getCountry() + " и " + country);
        }
    }

    private Camry createCamry(String color, double price) {
        Camry camry = new Camry();
        createCar(camry, color, price, Camry.WHEEL_DIAMETER, Camry.TRANSMISSION, Camry.MAX_SPEED);
        createSedan(camry);
        camry.setUsb(new USB());
        return camry;
    }

    public Solara createSolara(String color, double price) {
        Solara solara = new Solara();
        createCar(solara, color, price, Solara.WHEEL_DIAMETER, Solara.TRANSMISSION, Solara.MAX_SPEED);
        createSedan(solara);
        solara.setFridge(new Fridge());
        return solara;
    }

    public Hiance createHiance(String color, double price) {
        Hiance hiance = new Hiance();
        createCar(hiance, color, price, Hiance.WHEEL_DIAMETER, Hiance.TRANSMISSION, Hiance.MAX_SPEED);
        createCargoVan(hiance, Hiance.CARGO_CAPACITY);
        hiance.setReplacementWheel(factory.createWheel(Hiance.WHEEL_DIAMETER));
        return hiance;
    }

    public Dyna createDyna(String color, double price) {
        Dyna dyna = new Dyna();
        createCar(dyna, color, price, Dyna.WHEEL_DIAMETER, Dyna.TRANSMISSION, Dyna.MAX_SPEED);
        createCargoVan(dyna, Dyna.CARGO_CAPACITY);
        dyna.setSocket(new PowerSocket());
        return dyna;
    }

    public Car createCar(String model, String color, double price) {
        switch (model) {
            case Camry.MODEL:
                return createCamry(color, price);
            case Solara.MODEL:
                return createSolara(color, price);
            case Hiance.MODEL:
                return createHiance(color, price);
            case Dyna.MODEL:
                return createDyna(color, price);
            default:
                System.out.println("Модель не распознана.");
                return null;
        }
    }

    private void createSedan(Sedan sedan) {
        sedan.setCruiseControl(new CruiseControl());
    }

    private void createCargoVan(CargoVan cargoVan, int cargoCapacity) {
        cargoVan.setCargoCapacity(cargoCapacity);
    }

    private void createCar(Car car, String color, double price, int wheelDiameter, Transmission transmission, int maxSpeed) {
        try {
            checkCountryEquality();
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }

        car.setColor(color);
        car.setPrice(price);
        car.setCountry(country);
        car.setWheels(factory.createWheels(wheelDiameter));
        car.setTransmission(transmission);

        car.setEngine(factory.createEngine());
        car.setElectricalSystem(factory.createElectricalSystem());
        car.setFuelTank(factory.createFuelTank());
        car.setHeadlights(factory.createHeadlights());
        car.setMaxSpeed(maxSpeed);
    }
}
