/*Write a program to take three numbers as input and print: “All equal” if all are same, “Two equal” if any two are same, “All different” if all are different*/

import java.util.*;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("All equal");
        else if (a == b || b == c || a == c)
            System.out.println("Two equal");
        else
            System.out.println("All different");
    }
}
