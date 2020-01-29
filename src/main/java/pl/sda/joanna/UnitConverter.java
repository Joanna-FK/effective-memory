package pl.sda.joanna;

public class UnitConverter {

    public static double celsiusToFahrenheit(double degreesC ){
        return (degreesC *1.8)+32;
    }

    public static double fahrenheitToCelsius (double degreesF){

        return (degreesF-32)/1.8000;
    }

    public static double kilometerToMil (double km){
        return km * 0.62137;
    }

    public static double milToKilometer (double mi){
        return mi/0.62137;
    }

    public static double kilogramToPhound (double kg){
        return kg  * 2.2046;
    }

    public static double phoundTokilogram (double ph){
        return ph/2.2046;
    }
}
