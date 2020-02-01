package pl.sda.joanna.dayexercise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*Stwórz klasę TimeCalculator. Stwórz w niej metodę daysToChristmasEveInfo() wyświetlają informację w konsoli z komunikatem:
 "It's just [ilość dni]to Christmas Eve!". Jeżeli pozostało mniej jak 60 dni dodaj w nowej linii "Time to buy gifts". Metoda
 ta niech woła kolejną metode daysToChristmasEve(LocalDate now) do której przekażemy aktualną datę na podstawie której zwróci
 wartość liczbową ilości dni pozostałych do najbliższej Wigilii świąt Bożego Narodzenia. Spraw aby metoda była uniwersalna -
 jak najbliższe święta miną, powinna nadal działać. Pamiętaj również o końcówce roku. Użyj klasy LocalDate i jej metody now().
  Dwie różne daty możesz porównać poprzez ChronoUnit.DAYS.between(). Przetestuj też z metody main samą metodę daysToChristmasEve
   przekazując jej różne daty i drukując wynik.*/

public class TimeCalculator {

    static  void daysToChristmasEve(LocalDate now){
        LocalDate nextDayChristmas = LocalDate.of(now.getYear(),12,24);
        if(now.getMonthValue()== 12&&now.getDayOfMonth()>24){
            nextDayChristmas= nextDayChristmas.plusYears(1);
        }

        long howManyDays= ChronoUnit.DAYS.between(now, nextDayChristmas);
            System.out.println("It's just " + howManyDays +" "+"to Christmas Eve!");
            if (howManyDays<60){
                System.out.println("Time to buy gifts");
            }
        }
  public static void daysToChristmasEveInfo(){
        LocalDate now = LocalDate.now();
      daysToChristmasEve(now);
   }
   //Stwórz w TimeCalculator metodę minutesToEndOfClass(). Jej celem będzie wydrukowanie wiadomości "There is [ilość minut]
   // minutes left to the end of today class". Postaraj się zainspirować poprzednim zadaniem. Użyj jednak tym razem klasy
   // LocalTime. Następnie dodaj pętlę do while która będzie działała dopóki wartość ta nie będzie wynosić 0,
   // dodaj też w tej pętli Thread.sleep(5000) aby obliczenia i drukowanie były co 5 sekund.

    static void minutesToEndOfClass() throws InterruptedException {
        long howManyMinutes;
        LocalTime endOfClass =  LocalTime.of(16,0);
        do {
            LocalTime now  = LocalTime.now();
             howManyMinutes = ChronoUnit.MINUTES.between(now, endOfClass);
            System.out.println("There is "+ howManyMinutes +" "+ "minutes left to the end of today class.");
            Thread.sleep(5000);

        }while (howManyMinutes >=0);

    }
}


