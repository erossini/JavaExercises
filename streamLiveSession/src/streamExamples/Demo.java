package streamExamples;

/*
 Java Stream API
 ---------------

 1. Source (e.g. List, Set, Array... data structure containing objects)
 2. Intermediate Operations: transform the stream like
    filter, map etc.
    These are LAZY
3.  Terminal Operations: produces a result (side-effect)
    collect, forEach, reduce, etc.

    In Functional Programming: filter, map, reduce

    filter: condition item divisible by 2.
    map   : multiply the item by 2
    reduce: add all the items up
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    static void main() {
        List<String> names = Arrays.asList("Alice", "Alan", "Bob", "Charlie", "Donald", "Mary", "Nigel");

        // old style
        System.out.println("Print name in the old style");
        System.out.println("---------------------------");
        for(String name : names) {
            System.out.println(name);
        }

        // lambda
        System.out.println();
        System.out.println("Print name with lambda");
        System.out.println("---------------------------");
        names.forEach(System.out::println);

        // using stream
        System.out.println();
        System.out.println("Print name with stream");
        System.out.println("---------------------------");

        var result = names.stream()
                          .map(String::toUpperCase)
                          .filter(name -> name.startsWith("A"))
                          //.filter(name -> name.endsWith("N"))
                          .sorted()
                          .parallel()
                          .toList();

        System.out.println("Number of records: " + (long) result.size());
        result.forEach(System.out::println);

        // the original list doesn't change
        System.out.println();
        names.forEach(System.out::println);
    }
}