/*Question 4
Check Number Parity
Write a program in java to check whether the given number is an even number or not using if else statement.
Sample Test Case 1
input

12

output

No is Even

Sample Test Case 2

input

13

output

No is odd



Your answer*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //write your answer here
         Scanner scanner = new Scanner(System.in);

       
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.print("No is Even");
        } else {
            System.out.print("No is odd");
        }

        scanner.close();
    }
}
