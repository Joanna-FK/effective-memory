package pl.sda.joanna.converter;

import static pl.sda.joanna.converter.UnitConverter.*;

public class Application {
    public static void main(String[] args) {

        double degreesC = 17.5;
        System.out.println(celsiusToFahrenheit(degreesC));

        double degreesF = 75.5;
        System.out.println(fahrenheitToCelsius(degreesF));

        double km = 70;
        System.out.println(kilometerToMil(km));

        double mi = 50;
        System.out.println(milToKilometer(mi));

        double kg = 5.6;
        System.out.println(kilogramToPhound(kg));
        double lb = 10.5;
        System.out.println(phoundTokilogram(lb));
    }
}
