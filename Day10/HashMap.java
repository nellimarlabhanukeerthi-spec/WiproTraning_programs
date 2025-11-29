/*Write a Java program that takes a string and counts how many times each word appears using a HashMap.*/

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String text = "java is fun and java is powerful";

        String[] words = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);
    }
}
