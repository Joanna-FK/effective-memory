package pl.sda.joanna.listexercises;

import java.util.List;
import java.util.Map;

public class AppText {

    public static void main(String[] args) {


        String text = "Klasa ta udostępnia nam kilka metod za pomocą których wygenerujemy sobie dowolnego typu liczby" +
                " pseudolosowe, z wybranych przez siebie zakresów " +
                "Wymienię i opiszę kilka bardziej przydatnych metod lalalala";

        Map<Character, List<String>> mapOfWords = TextAnalyzer.groupWordsByFirstCharacter(text);
        System.out.println(mapOfWords);

        List<String> stringsAnalyzer = TextAnalyzer.myTextAnalyzer(text);
        System.out.println(stringsAnalyzer);
    }
}
