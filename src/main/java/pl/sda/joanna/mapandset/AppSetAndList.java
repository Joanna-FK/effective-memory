package pl.sda.joanna.mapandset;

import java.time.LocalDate;
import java.util.*;

public class AppSetAndList {

    public static void main(String[] args) {
        MyPerson firstPerson = new MyPerson("Maria", "Kowalska", "70070628839", LocalDate.of(1970, 7, 6));
        MyPerson secondPerson = new MyPerson("Joanna", "Jankowska", "04230588929", LocalDate.of(2004, 3, 5));
        MyPerson thirdPerson = new MyPerson("Alan", "Jankowski", "10221489793", LocalDate.of(1990, 2, 14));

        List<MyPerson> myPersonList = new ArrayList<>();

        myPersonList.add(firstPerson);
        myPersonList.add(secondPerson);
        myPersonList.add(thirdPerson);

        myPersonList.get(0);
        myPersonList.get(1);
        myPersonList.get(2);

        for (MyPerson personList : myPersonList) {
            System.out.println(personList.getFirstName() + " " + personList.getLastName());
        }

        Set<MyPerson> myPersonSet = new HashSet<>();
        myPersonSet.add(firstPerson);
        myPersonSet.add(secondPerson);
        myPersonSet.add(thirdPerson);

        for (MyPerson personSet : myPersonSet) {
            System.out.println(personSet.getPeselNumber().length());
        }

        Map<String , MyPerson > myPersonMap= new HashMap<>();
        myPersonMap.put("70070628839",firstPerson );
        myPersonMap.put("04230588929", secondPerson);
         {
            System.out.println(myPersonMap.keySet());
        }

        Employee employee = new Employee("Alan", "10221489793", 4500);
        System.out.println(employee.giveRaise(1000));

    }
}
