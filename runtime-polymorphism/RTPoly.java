/*
*       Author Tanzilur Rahman (an7agon1st)
*   Free for educational use
*
*   Demonstrating runtime polymorphism using method overriding 
*
*   Runtime polymorphism resolves the conflict at runtime
*
*   overriden methods are called depending on the referencing object by the refrence variable regardless of if the reference 
*   is a super class or child class variable
*
*   Variables arent overridden so they're called based on the Class of the reference variable 
*
*   Referencing a child object from a parent referencing variable is called upcasting 
*/

class ParentC {
    void methodToOverride() {
        System.out.println("Super Class Method");
    }

    String hey_we_got_the_same_name = "MAMA";
}

class ChildC extends ParentC {
    void methodToOverride() {
        System.out.println("Baby Class Method");
    }

    String hey_we_got_the_same_name = "BABY";
}

class Main {
    public static void main(String[] args) {
        ParentC foo = new ChildC(); // upcasting
        foo.methodToOverride(); // prints the child class methodToOverride
        // resolved via runtime polymorphism

        System.out.println("Variable " + foo.hey_we_got_the_same_name); // prints the parents class variable
        foo = new ParentC();
        foo.methodToOverride(); // prints the parent class methodToOverride
    }
}