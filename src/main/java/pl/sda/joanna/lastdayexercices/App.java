package pl.sda.joanna.lastdayexercices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,0,78,968,-457,365,457,415,-457,52358,-47,12,475,-35,457,698,74,-147,96,-7);
        IntegerService.intSum(numbers);
        IntegerService.intAverage(numbers);
        IntegerService.printAllStatistics(numbers);


        StreamsExample.loopExample();
        StreamsExample.streamExample();

        List<String> words = WordProvider.provide();
        firstTask(words);
        secondTask(words);
        thirdTask(words);


    }

    public static void firstTask(List<String> words) {
        List<String> wordStartD = words.stream()
                .filter(word -> word.startsWith("d"))
                .collect(Collectors.toList());
        System.out.println(wordStartD);
    }

    public static void secondTask(List<String> words) {
        List<String> wordStartA = words.stream()
                .filter(word -> word.startsWith("a") && word.length() <= 4)
                .collect(Collectors.toList());
        System.out.println(wordStartA);
    }

    public static void thirdTask(List<String> words) {
        List<String> upperCaseWords = words.stream()
                .map(s -> s.substring(0, 1)
                        .toUpperCase() + s.substring(1)).collect(Collectors.toList());
        System.out.println(upperCaseWords);

    }
}
