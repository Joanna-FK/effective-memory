package pl.sda.joanna;

public class UnitConverter {

    public static double celsiusToFahrenheit(double degreesC ){
        double fahrenheit = (degreesC *1.8)+32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius (double degreesF){
      double celsius = (degreesF-32)/1.8000;

        return celsius;
    }

    public static double kilometerToMil (double km){
        double mil = km * 0.62137;
        return mil;
    }

    public static double milToKilometer (double mi){
        double km = mi/0.62137;
        return km;
    }

    public static double kilogramToPhound (double kg){
        double ph = kg  * 2.2046;
        return ph;
    }

    public static double phoundTokilogram (double ph){
        double kg =  ph/2.2046;
        return kg;
    }
}
