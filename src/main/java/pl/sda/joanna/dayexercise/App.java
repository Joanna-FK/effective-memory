package pl.sda.joanna.dayexercise;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

    TimeCalculator.daysToChristmasEveInfo();
    TimeCalculator.daysToChristmasEve(LocalDate.of(2020,7,24));
    TimeCalculator.daysToChristmasEve(LocalDate.of(2020,12,23));
    TimeCalculator.daysToChristmasEve(LocalDate.of(2021,2,14));
    TimeCalculator.daysToChristmasEve(LocalDate.of(2023,12,28));


    }
}
