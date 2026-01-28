package optionalDemo;

import java.util.Optional;

public class Demo {
    static void main() {
        String name = getName();

        // if the name is null, the code raises an error
        //System.out.println(name.length());

        if(name != null) {
            System.out.println(name.length());
        } else {
            System.out.println(0);
        }

        Optional<String> nameOp = Optional.ofNullable(getName());
        System.out.println(nameOp.map(String::length).orElse(0));
        System.out.println(nameOp.map(String::valueOf).orElse(""));

        var len = nameOp.map(String::length);
        System.out.println(len.getClass());
    }

    static String getName() {
        return "aa";
    }
}