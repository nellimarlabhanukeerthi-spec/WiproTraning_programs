/*Take user input and find sum of numbers.*/


import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to add: ");
        int count = sc.nextInt();

        int sum = 0;
        System.out.println("Enter " + count + " numbers:");

        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
