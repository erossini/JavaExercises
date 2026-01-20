package interfaceConflicts;

public class ChildClass extends ParentClass implements Interface1, Interface2 {
    public int someMethod() {
        return Interface1.super.someMethod();
    }
}
