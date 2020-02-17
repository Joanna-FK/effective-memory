package pl.sda.joanna.quicksort;

import pl.sda.joanna.exercises.person.Person;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        comparableTest();
        arraysSortTest();
        quickSortTest();

    }

    private static void comparableTest() {

        Person personOne = new Person("John", "Smith", "123", LocalDate.of(1978, 11, 5));
        Person personTwo = new Person("Ala", "Kowalski", "456", LocalDate.of(1945, 10, 25));
        Person personThree = new Person("Abdul", "Mohammed", "478", LocalDate.of(1945, 1, 30));
        Person personFour = new Person("Jan", "Jankowski", "124", LocalDate.of(1999, 7, 14));
        Person personFive = new Person("Moly", "Wilson", "748", LocalDate.of(1980, 4, 15));
        Person personSix = new Person("Big", "O", "521", LocalDate.of(1984, 1, 15));
        Person personSeven = new Person("Gertruda", "Shmidt", "332", LocalDate.of(2000, 1, 1));
        Person personEight = new Person("Jozue", "Jozefowicz", "748", LocalDate.of(1999, 7, 5));
        Person personNine = new Person("TEST", "ACTOR", "312", null);

        Person[] people = {personOne, personTwo, personThree, personFour, personFive, personSix, personSeven, personEight, personNine};
        // System.out.println(personSix.compareTo(personSeven));

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

    }

    private static void arraysSortTest() {
        int[] arrOne = {12, 589, 456, 32, 0, 7, 45, 9648, 7};
        int[] arrTwo = {-45, -85, 8, 968, 0, 14, -47, 3256, 47, 1, -8};
        System.out.println("arrOne");
        System.out.println(Arrays.toString(arrOne));
        Arrays.sort(arrOne);
        System.out.println(Arrays.toString(arrOne));
        System.out.println("arrTwo");
        System.out.println(Arrays.toString(arrTwo));
        Arrays.sort(arrTwo);
        System.out.println(Arrays.toString(arrTwo));
    }

    private static void quickSortTest() {
        int[] arrOne = {12, 589, 456, 32, 0, 7, 45, 9648, 7};
        int[] arrTwo = {-45, -85, 8, 968, 0, 14, -47, 3256, 47, 1, -8};
        System.out.println("arrOne");
        System.out.println(Arrays.toString(arrOne));
        QuickSort.sort(arrOne);
        System.out.println(Arrays.toString(arrOne));
        System.out.println("arrTwo");
        System.out.println(Arrays.toString(arrTwo));
        QuickSort.sort(arrTwo);
        System.out.println(Arrays.toString(arrTwo));
    }


}
