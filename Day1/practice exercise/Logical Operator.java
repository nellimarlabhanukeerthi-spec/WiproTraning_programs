/*Question 2

Logical Operators in Java
Instructions:

Write a program that takes two boolean values as input and performs logical operations (AND, OR) on them using the logical operators& print the result.

Examples:

# Examples: 
1. boolean a = true; 
   boolean b = false; 
   boolean result = a && b; 
   System.out.println(result); // Output: false 
Sample Input & Output:

Sample Input:
true
false

Sample Output:
false
true
Hints:
1. Remember to use the correct syntax for the logical operators.
2. Make sure to include the necessary boolean variables or values in the logical operations.
3. Check the output on the console to verify if the logical operations are working correctly

Your answer*/

import java.util.Scanner;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input1 = scanner.nextBoolean();
        boolean input2 = scanner.nextBoolean();
        
        // TODO: Write your code here
        boolean andResult = input1 && input2;
        boolean orResult = input1 || input2;
        System.out.println(andResult);
        System.out.println(orResult);
        scanner.close();
    }
}
