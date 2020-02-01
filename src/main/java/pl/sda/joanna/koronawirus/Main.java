package pl.sda.joanna.koronawirus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Programmer> programmerList= new ArrayList<>();
        programmerList.add(new Programmer(1, "Mariusz", "Kowalski", Gender.MEN));
        programmerList.add (new Programmer(2, "Alina", "Jozefczyk", Gender.WOMEN));
        programmerList.add (new Programmer(3, "Joahn", "Smith", Gender.MEN));
        programmerList.add (new Programmer(4, "Abdullah", "Mohammed", Gender.MEN));
        programmerList.add (new Programmer(5, "Ann", "Goodman", Gender.WOMEN));
        programmerList.add (new Programmer(6, "Max", "Kolonko", Gender.MEN));
        programmerList.add (new Programmer(7, "Pink", "Unikorn", Gender.OTHER));
        programmerList.add (new Programmer(8, "Matrix", "Matrix", Gender.OTHER));

        LifeSimulator.simulate(programmerList, 70);
    }
}
