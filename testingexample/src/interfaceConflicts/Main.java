package interfaceConflicts;

public class Main {
    static void main() {
        ChildClass class1 = new ChildClass();
        System.out.printf("Number %d", class1.someMethod());
    }
}
