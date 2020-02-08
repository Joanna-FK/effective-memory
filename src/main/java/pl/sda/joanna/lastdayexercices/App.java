package pl.sda.joanna.lastdayexercices;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        StreamsExample.loopExample();
        StreamsExample.streamExample();

        List<String> words = WordProvider.provide();

        List<String> wordStartD =  words.stream()
                .filter(word -> word.startsWith("d"))
                .collect(Collectors.toList());
        System.out.println(wordStartD);

        List<String> wordStartA = words.stream()
                .filter(word -> word.startsWith("a") && word.length()<=4)
                .collect(Collectors.toList());
        System.out.println(wordStartA);


    }

}
