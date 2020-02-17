package pl.sda.joanna.listexercises;

import java.util.*;

public class TextAnalyzer {


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
