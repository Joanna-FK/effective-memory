package pl.sda.joanna.exercises.person;


import java.time.LocalDate;

public class AppPerson {
    public static void main(String[] args) {

        Person person = new Person("Maria", "Kowalska", "70070628839", LocalDate.of(1970, 7, 6));
        Person underagePerson = new Person("Joanna", "Jankowska", "04230588929", LocalDate.of(2004, 3, 5));
        Person invalidBirthDatePerson = new Person("NotAlan", "Jankowski", "10221489793", LocalDate.of(1990, 2, 14));

        System.out.println(AgeValidator.isAdult(person));
        System.out.println(AgeValidator.isAdult(underagePerson));
        System.out.println(AgeValidator.isAdult(invalidBirthDatePerson));


    }
}
