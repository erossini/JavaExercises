package livesession2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<String> fruits = Arrays.asList("apple", "banana", "", "orange", "grape");

        //it is possible to create your comparator and this is the implementation
        //var c = new MyComparator();
        //Collections.sort(fruits, c);
        //for (String s: fruits) {
        //    System.out.printf(s + "\n");
        //}

        // like Linq in C#.
        // s1 and s2 represent the parameter list and this is called head
        fruits.sort((s1, s2) -> {
            // this is called neck
            return Integer.compare(s1.length(), s2.length());
        });
        for (String s: fruits) {
            System.out.printf(s + "\n");
        }
    }
}

class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        // return -1 if the first one is less than the second one
        // return  0 if they are the same
        // return  1 if the second one is greater than the first one

        // if one of the strings is null, it returns
        if (o1 == null || o2 == null) {
            // Handle nulls: nulls go last
            return o1 == null ? (o2 == null ? 0 : 1) : -1;
        }

        return Integer.compare(o1.toString().length(), o2.toString().length());
    }
}