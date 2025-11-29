/*Merge two lists, remove duplicates, and sort in ascending order. List 1: [3, 5, 7, 5] . List 2: [2, 7, 8, 3]. Output : [2, 3, 5, 7, 8]*/

import java.util.*;

public class merge {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 5, 7, 5);
        List<Integer> list2 = Arrays.asList(2, 7, 8, 3);

        List<Integer> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);

        List<Integer> result = new ArrayList<>();

        for (Integer n : merged) {
            if (!result.contains(n)) {  // remove duplicates
                result.add(n);
            }
        }

        Collections.sort(result); // sort
        System.out.println("Q5 Output: " + result);
    }
}
