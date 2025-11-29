/*Given a list of strings, write a program to reverse the order of words in the list and also reverse each word itself. Input: ["Java", "is", "fun"] . Output:  ["nuf", "si", "avaJ"]*/

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "fun");
        List<String> result = new ArrayList<>();

        for (int i = words.size() - 1; i >= 0; i--) {
            String reversedWord = new StringBuilder(words.get(i))
                                  .reverse()
                                  .toString();
            result.add(reversedWord);
        }

        System.out.println("Q3 Output: " + result);
    }
}
