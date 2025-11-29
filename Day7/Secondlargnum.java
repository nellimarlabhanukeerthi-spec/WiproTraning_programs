/*Given a list of integers, write a Java program to find the second largest number.*/

import java.util.*;

public class secondlargnum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 50, 30, 20, 40);

        List<Integer> sorted = new ArrayList<>(nums);
        Collections.sort(sorted); // ascending

        int secondLargest = sorted.get(sorted.size() - 2);

        System.out.println("Q4 Output (Second Largest): " + secondLargest);
    }
}
