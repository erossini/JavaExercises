package example;

public interface Person {
    default void thing() {
        System.out.printf("Prints something\n");
    }
}
