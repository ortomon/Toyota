package org.javaacadmey.toyota.production;

import org.javaacadmey.toyota.production.exceptions.CountryFactoryNotEqualException;
import org.javaacadmey.toyota.vehicles.models.camry.Camry;
import org.javaacadmey.toyota.vehicles.models.camry.components.USB;
import org.javaacadmey.toyota.vehicles.models.dyna.Dyna;
import org.javaacadmey.toyota.vehicles.models.dyna.components.PowerSocket;
import org.javaacadmey.toyota.vehicles.models.hiance.Hiance;
import org.javaacadmey.toyota.vehicles.models.solara.components.Fridge;
import org.javaacadmey.toyota.vehicles.models.solara.Solara;
import org.javaacadmey.toyota.vehicles.types.*;

public class AssemblyLine {
    private String country;
    private Factory factory;

    public AssemblyLine(String country, Factory factory) {
        this.country = country;
        this.factory = factory;
    }

    private void checkCountryEquality() throws CountryFactoryNotEqualException {
        if (!factory.getCountry().equals(country)) {
            throw new CountryFactoryNotEqualException("Страны фабрики производства и конвейера не совпадают: "
                    + factory.getCountry() + " и " + country);
        }
    }

    private Camry createCamry(String color, double price) {
        Camry camry = new Camry();
        createCar(camry, color, price, Camry.WHEEL_DIAMETER);
        camry.setUsb(new USB());
        return camry;
    }

    public Solara createSolara(String color, double price) {
        Solara solara = new Solara();
        createCar(solara, color, price, Solara.WHEEL_DIAMETER);
        solara.setFridge(new Fridge());
        return solara;
    }

    public Hiance createHiance(String color, double price) {
        Hiance hiance = new Hiance();
        createCar(hiance, color, price, Hiance.WHEEL_DIAMETER);
        hiance.setReplacementWheel(factory.createWheel(Hiance.WHEEL_DIAMETER));
        return hiance;
    }

    public Dyna createDyna(String color, double price) {
        Dyna dyna = new Dyna();
        createCar(dyna, color, price, Dyna.WHEEL_DIAMETER);
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

    private void createCar(Car car, String color, double price, int wheelDiameter) {
        try {
            checkCountryEquality();
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }

        car.setColor(color);
        car.setPrice(price);
        car.setCountry(country);

        car.setEngine(factory.createEngine());
        car.setElectricalSystem(factory.createElectricalSystem());
        car.setFuelTank(factory.createFuelTank());
        car.setHeadlights(factory.createHeadlights());
        car.setWheels(factory.createWheels(wheelDiameter));
    }
}
