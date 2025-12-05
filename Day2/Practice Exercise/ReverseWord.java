/*Question 3
Marks: 0/1

Reverse each word in a string
Write a function to reverse each word in a string.

Description :- A method has to be created that takes a string as input and extracts each word from that string and then reverse each word individually and gives the output as a reversed string. 

Example :-

Input:- great learning

output :- taerg gninrael

input :- hello guys how are you

output :- olleh syug woh era uoy



Explanations :- As the input string is great learning, each word has to be extracted i.e. great and learning then individually each word has to be reversed so it will be taerg and gninrael. after combining these two words into as single string the final output will be taerg gninrael.

Your answer*/

public class Main {

    // function to reverse each word in a string
    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");  // split the string into words
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse()).append(" ");
        }

        // remove the extra space at the end
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        String input1 = "great learning";
        String input2 = "hello guys how are you";

        System.out.println(reverseEachWord(input1)); // taerg gninrael
        System.out.println(reverseEachWord(input2)); // olleh syug woh era uoy
    }
}
