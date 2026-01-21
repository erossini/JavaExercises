package defMethod;

public class Demo {
    // an interface is a strict contract
    // add new methods to the interface, you will need to add them to all
    // implementation classes.

    // default methods allows you to provide an interface with a pre-written body.

    void main() {
        Logger consoleLogger = msg -> System.out.println(msg);
        consoleLogger.log("Application started");
        consoleLogger.logError("Application started");
    }
}

interface Logger {
    void log(String message);

    default void logError(String message) {
        System.err.printf("ERROR: " + message);
    }
}