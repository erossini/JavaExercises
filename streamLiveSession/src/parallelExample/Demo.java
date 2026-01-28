package parallelExample;

import java.util.Arrays;
import java.util.List;

public class Demo {
    static void main() {
        List<Integer> numbers = Arrays.asList(11, 2, 5, 3, 4, 14, 2, 15, 5, 9, 8);

        List<Integer> topThree = numbers.stream()
                .sorted()
                .distinct()
                .dropWhile(n -> n <= 3)
                .limit(3)
                .toList();
        System.out.println(topThree);
    }
}
