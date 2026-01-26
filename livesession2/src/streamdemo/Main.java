package streamdemo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    /*
     * Example how to use stream
     */
    static void main() {
        List<Integer> list = Arrays.asList(1,2,3);

        // Print all the values in the list
        System.out.println("List of elements in the list:");
        list.forEach(System.out::println);

        /*
            It calculates the sum of the squares of all numbers in the list.

            1. list.stream()
                    Turns the list into a stream so you can process its elements functionally.
            2. .map(x -> x * x)
                    Transforms each element x into its square.
                        - If the list is [1, 2, 3, 4]
                        - After map, the stream becomes [1, 4, 9, 16]
            3. .reduce((x, y) -> x + y)
                    Reduces the stream by repeatedly applying the function (x + y).
                        - This adds all the squared values together.
                        - For [1, 4, 9, 16], the result is 30.
                    What are x and y?
                        - x → the accumulated value so far
                        - y → the next element from the stream
                    Reduce returns an Optional<T> because the stream might be empty.
            4. .get()
                   Extracts the value from the Optional.
                   ⚠️ If the list is empty, .get() will throw NoSuchElementException

             x and y represent the 2 number in the list.
             x represents the accumulated value so far.
             y represents the next item in the stream
         */
        System.out.println("\nSum of the numbers:");
        int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
        System.out.println(sum);

        // this is a more compact solution
        int sum2 = list.stream().reduce(0, (x, y) -> x + (y * y));
        System.out.println(sum2);

        int sum3 = list.stream()
                .mapToInt(x -> x * x)
                .sum();
        System.out.println(sum3);

        System.out.println("\nStream builder:");
        Stream<String> streamsBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
        streamsBuilder.forEach(System.out::println);

        System.out.println("\nStream generate:");
        Stream<String> streamGenerated = Stream.generate(() -> "item").limit(10);
        streamGenerated.forEach(System.out::println);

        System.out.println("\nStream iterate:");
        Stream<Integer> streamIterate = Stream.iterate(40, x -> x + 1).limit(20);
        streamIterate.forEach(System.out::println);

        System.out.println("\nStream skip:");
        Stream<String> onveModifiedStream = Stream.of("abc", "def", "ghi", "jkl").skip(1);
        onveModifiedStream.forEach(System.out::println);

        // if you use this code, you get an error
        // when Stream is used once, it can't be used again
        //Stream<String> twiceModifiedStream = onveModifiedStream.skip(1).map(item -> item.substring(0, 2));
        //twiceModifiedStream.forEach(System.out::println);

        var reduced = IntStream.range(0, 10).reduce((a,b) -> a + b);
        System.out.println(reduced);

        System.out.println("\nProduct list:");
        List<Product> productList = Arrays.asList(
                new Product(23, "potatoes", 2.91d),
                new Product(14, "orange", 2.12d),
                new Product(23, "bread", 3.99d),
                new Product(13, "sugar", 3.10d),
                new Product(13, "lemon", 1.53d));

        var rsl = productList.stream().map(Product::getName).collect(Collectors.toList());
        System.out.println(rsl);

        var rsl2 = productList.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println(rsl2);

        var rsl3 = productList.stream().collect(Collectors.summarizingDouble(Product::getPrice));
        System.out.printf("Sum of product list: %s", rsl3.getSum());
    }
}