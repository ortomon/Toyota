package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountryFactoryNotEqualException;
import org.javaacadmey.toyota.model.*;
import org.javaacadmey.toyota.type.*;

public class AssemblyLine {
    private String country;
    private Factory factory;

    private void checkCountryEquality() throws CountryFactoryNotEqualException {
        if (!factory.getCountry().equals(country)) {
            throw new CountryFactoryNotEqualException("Страны фабрики производства и конвейера не совпадают: "
                    + factory.getCountry() + " и " + country);
        }
    }

    public Camry createCamry(String color, double price) throws CountryFactoryNotEqualException {
        Camry camry = new Camry();
        createCar(camry, color, price, Camry.WHEEL_DIAMETER);
        return camry;
    }

    public Solara createSolara(String color, double price) throws CountryFactoryNotEqualException {
        Solara solara = new Solara();
        createCar(solara, color, price, Solara.WHEEL_DIAMETER);
        return solara;
    }

    public Hiance createHiance(String color, double price) throws CountryFactoryNotEqualException {
        Hiance hiance = new Hiance();
        createCar(hiance, color, price, Hiance.WHEEL_DIAMETER);
        return hiance;
    }

    public Dyna createDyna(String color, double price) throws CountryFactoryNotEqualException {
        Dyna dyna = new Dyna();
        createCar(dyna, color, price, Dyna.WHEEL_DIAMETER);
        return dyna;
    }

    private void createCar(Car car, String color, double price, int wheelDiameter) throws CountryFactoryNotEqualException {
        checkCountryEquality();
        car.setColor(color);
        car.setPrice(price);

        car.setEngine(factory.createEngine());
        car.setElectricalSystem(factory.createElectricalSystem());
        car.setFuelTank(factory.createFuelTank());
        car.setHeadlights(factory.createHeadlights());
        car.setWheels(factory.createWheels(wheelDiameter));
    }
}
