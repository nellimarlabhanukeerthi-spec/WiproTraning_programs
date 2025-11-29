/*Write a Java program to remove duplicate elements from a List without using a Set. You should retain the first occurrence of each element. 
Sort the output in ascending order. Input: [10, 30, 20, 20, 10, 30, 20, 40]. Output: [10, 20, 30, 40]*/

import java.util.*;

public class duplicate{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 30, 20, 20, 10, 30, 20, 40);
        List<Integer> result = new ArrayList<>();

        for (Integer n : list) {
            if (!result.contains(n)) {  // keep only first occurrence
                result.add(n);
            }
        }

        Collections.sort(result); // sort ascending
        System.out.println("Q2 Output: " + result);
    }
}
