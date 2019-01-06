/*
*       Author Tanzilur Rahman (an7agon1st)
*   Free for educaitonal and private use
*
*   Abstraction is used to hide the working of a class only to show its functionality
*
*   Abstract class can contain 
*   -abstract methods, non abstract methods, constructors, data variables and such
*
*   However they need to be extended to use it
*   Only abstract classes can contain abstract methods
*   Abstract methods need to be defined in an extending class
*
*
*/

abstract class Abs { // an abstract class
    abstract void printAll(); // an abstract method

    void nonAbstract() { // a non abstract method in an abstract class
        System.out.println("Non abstract method");
    }

    Abs() {
        System.out.println("Abstract classes can have their own constructors"); // abstract class constructors
    }
}

class Ext extends Abs {
    void printAll() {
        System.out.println("Abstract method is implemented in an extending class"); // abstract method implemented in an
                                                                                    // extending class
    }
}

class Main {
    public static void main(String[] args) {
        Ext foo = new Ext();
        foo.printAll();
        foo.nonAbstract();
    }
}