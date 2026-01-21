package livesession2;

import java.util.function.Predicate;

public class Demo3 {
    static void main() {
        Predicate<String> startsWithA = s -> s.startsWith("A");
        Predicate<String> endsWithZ = s -> s.endsWith("Z");

        System.out.println(startsWithA.and(endsWithZ).test("All"));
        System.out.println(startsWithA.and(endsWithZ).test("All letters Z"));

        Predicate<String> both = startsWithA.and(endsWithZ);
        System.out.println(both.test("All"));
    }
}