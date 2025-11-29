/*Given a List, remove duplicates while preserving insertion order. */

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,1,5,3);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);

        System.out.println(uniqueList);
    }
}
