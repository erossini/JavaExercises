package interfaceConflicts;

public interface Interface2 {
    default int someMethod() { return 7; }
}
