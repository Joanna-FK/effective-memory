package pl.sda.joanna.lastdayexercices;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class IntegerService {
    public static void intSum(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("sum of elements is: " + sum);
    }

    public static void intAverage(List<Integer> numbers) {
        OptionalDouble average = numbers.stream().mapToInt(n -> n).average();

        double averageAsDouble = average.getAsDouble();
        System.out.println("average of elements is: " + Math.round(averageAsDouble));
    }

    public static void printAllStatistics(List<Integer> numbers){
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(n -> n).summaryStatistics();
        System.out.println(intSummaryStatistics.toString());
    }
}
