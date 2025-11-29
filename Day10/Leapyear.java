/*Write a one-line condition (no multiple ifs) that correctly determines whether a year is a leap year.*/

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // One-line condition to check leap year
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        System.out.println(year + " is leap year? " + isLeap);
        
        sc.close();
    }
}
