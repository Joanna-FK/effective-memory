package pl.sda.joanna.mapandset;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PensionAnalyzerApp {

    public static void main(String[] args) {

        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324", 25000);
        Employee grazynka = new Employee("Grażynka", "456", 3500);
        Employee karol = new Employee("Karol", "433", 13000);
        Employee zbigniew = new Employee("Zbigniew", "555", 13000);
        Employee joanna = new Employee("Joanna", "322", 1500);
        Employee aziz = new Employee("Aziz", "333", 4999);

        List<Employee> allEmployee = new ArrayList<>();
        allEmployee.add(kristoff);
        allEmployee.add(kasia);
        allEmployee.add(grazynka);
        allEmployee.add(karol);
        allEmployee.add(zbigniew);
        allEmployee.add(joanna);
        allEmployee.add(aziz);

        List<Employee> employeeForDismissalList = new ArrayList<>();
        for (Employee singleEmployee : allEmployee) {
            if (singleEmployee.getSalary() < 10000) {
                employeeForDismissalList.add(singleEmployee);
            }
        }

        System.out.println(employeeForDismissalList);
        Employee employeeToFire = getUnluckyEmployee(employeeForDismissalList);
        System.out.println("Person to fire" + employeeToFire);

        System.out.println("Employee for dismissal is number: "
                + randomEmployeeForDismissal(employeeForDismissalList) + " from employee dismissal list");
    }

    public static int randomEmployeeForDismissal(List<Employee> employeeForDismissal) {
        Random randomEmployee = new Random();
        return randomEmployee.nextInt(employeeForDismissal.size());
    }

    private static Employee getUnluckyEmployee(List<Employee> employeeForDismissal) {
        int indexOfEmployee = new Random().nextInt(employeeForDismissal.size());
        return employeeForDismissal.get(indexOfEmployee);

    }
}
