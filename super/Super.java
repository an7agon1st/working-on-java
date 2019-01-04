class SuperC {
    String tuna = "Super variable";

    void printStr() {
        System.out.println("Super method");
    }

    SuperC() {
        System.out.println("Super Constructor");
    }
}

class NormalC extends SuperC {
    NormalC() { // calls child constructor
        super(); // calls the super class constructor
        // super() is added by the compiler if not manually mentioned
        System.out.println("Child Constructor");
    }

    String tuna = "Child variable";

    void printStr() {
        super.printStr(); // calls the super class method
        System.out.println("Child method");
    }

    void printVar() {
        System.out.println("Super class variable = " + super.tuna); // prints the superclass variable
        System.out.println("Child class variable = " + tuna); // prints the child class variable
    }
}

class Main {
    public static void main(String[] args) {
        NormalC foo = new NormalC();
        foo.printStr(); // calls the child class method
        foo.printVar();
    }
}