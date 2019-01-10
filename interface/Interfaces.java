/*
*       Author: Tanzilur Rahman (an7agon1st)
*   Free for educational use
*
*   Demonstrate the different uses of an interface
*
*   Still need to do a more thorough study on practical implementations for the same
*
*/

interface TestingInterface {
    void printAll(); // compiler adds public abstract

    default void printDef() {
        System.out.println("This is a default function in an interface");
    }

    int var_val = 69; // compiler adds public static final

    static int cube(String s) {
        System.out.println("You can add static methods too " + s);
        return 1;
    }
}

interface TestingInterfaceCopy_orIsIt {
    void printAll();

    // default void printDef() {
    // System.out.println("This is a default function in another interface");
    // }
    //
    // two interfaces cannot have the same default method if implemented by the same
    // class (CT ERROR)
}

interface MarkerInterface {
    // this is a marker interface. tells JVM what to do or something like that
}

class TestInterface implements TestingInterface, TestingInterfaceCopy_orIsIt { // multiple inheritance
    public void printAll() {
        System.out.println(
                "This method, defined in interfaces TestingInterface and TestingInterfaceCopy_orIsIt is implmented by this class");
    }

    TestInterface() {
        TestingInterface.super.printDef(); // calls the method in the interface TestingInterfaceCopy_orIsIt
    }
}

class Main {
    public static void main(String[] args) {
        TestInterface foo = new TestInterface();
        int ret = TestingInterface.cube("Banana Hammock"); // calls the static method in the interface
        System.out.println("Interface variable = " + TestingInterface.var_val);
        foo.printAll(); // the class TestInterface implements the interfaces so there is no ambiguity in
                        // similar names
        // TestingInterface.printDef();

    }
}