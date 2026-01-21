package livesession2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {
    // Predicate<T>   returns true or false
    // Consumer<T>    accept
    // Function<T, R> apply (receives T and return R)
    // Supplier<T>    get
    static void main(String[] args) {
        // Predicate
        // if the string is longer than 5 chars
        Predicate<String> isLong = (s) -> {
            return s.length() > 5;
        };

        System.out.println("\nPredicate");
        System.out.println("----------------");
        System.out.println(isLong.test("apple"));              // false
        System.out.println(isLong.test("this is an example")); // true

        // function
        System.out.println("\nFunction example");
        System.out.println("----------------");
        Function<String, Integer> getLength = (s) -> {
            return s.length();
        };

        System.out.println(getLength.apply("apple"));
        System.out.println(getLength.apply("this is an example"));

        // Consumer
        System.out.println("\nConsumer example");
        System.out.println("----------------");
        List<String> fruits = Arrays.asList("apple", "banana", "", "orange", "grape");

        fruits.forEach(s -> System.out.println(s));

        // cannot be concurrent like the line above
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}