package example;

import example.impl.StudentImpl;
import example.impl.TeachingAssistentImpl;

public class Main {
    static void main(String[] args) {
        var s = new StudentImpl();
        var ta = new TeachingAssistentImpl();

        s.name = "Enrico";
        s.thing();
        System.out.printf("Name is: %s\n", s.name);
    }
}
