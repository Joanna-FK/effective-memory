package pl.sda.joanna.listexercises;

import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        String text = "Klasa ta, udostępnia nam kilka metod, za pomocą których wygenerujemy sobie dowolnego typu liczby pseudolosowe, z wybranych przez siebie zakresów. Wymienię i opiszę kilka bardziej przydatnych metod lalalala.";

        Map<Character, List<String>> mapOfWords =  groupWordsByFirstCharacter(text);
        System.out.println(mapOfWords);

        List<String> stringsAnalyzer = myTextAnalyzer(text);
        System.out.println(stringsAnalyzer);
    }

    public static Map <Character, List<String >>groupWordsByFirstCharacter (String text){

        Map<Character, List<String>> characterStringMap = new HashMap<>();
        char [] alphabet = "abcdefghijklmnopqrstuwxyz".toCharArray();
        for (char letter : alphabet){
            characterStringMap.put(letter, new ArrayList<>());
        }

        String[]splitText = text.split(" ");
        for ( String oneWord: splitText)
        {characterStringMap.get(oneWord.toLowerCase().charAt(0)).add(oneWord);
        }
            return characterStringMap;
    }

    public static List <String> myTextAnalyzer (String text){

        return Arrays.asList(text.split(" "));
   }


}
