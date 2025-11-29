/* Find the Largest of Three Numbers . Take user input.*/

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
