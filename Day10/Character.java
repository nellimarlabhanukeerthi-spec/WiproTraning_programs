/* Given a character input, determine whether it is: Uppercase letter, Lowercase letter, Digit, Special character (Avoid Character utility methods use ASCII range checks manually.)*/

import java.util.Scanner;

public class CharTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String type = (ch >= 65 && ch <= 90) ? "Uppercase Letter" :
                      (ch >= 97 && ch <= 122) ? "Lowercase Letter" :
                      (ch >= 48 && ch <= 57) ? "Digit" :
                      "Special Character";

        System.out.println("The character '" + ch + "' is a " + type);

        sc.close();
    }
}
