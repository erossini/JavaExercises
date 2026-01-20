package interfaceConflicts;

public interface Interface1 {
    default int someMethod() { return 5; }
}
