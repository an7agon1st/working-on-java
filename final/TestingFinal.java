/*
*   Author Tanzilur Rahman (an7agon1st)
*   Can be used for educational purposes
*   Demonstrated use of final keyword with variables, method and class
*   
*   final variable: cannot be changed in value
*   final method: cannot be overridden
*   final class: cannot be inherited
*
*/

class ParentC {
    final void printMsg() { // final method
        System.out.println("This is a final method, it can be inherited");
    }
}

final class ChildC extends ParentC { // the class ChildC cannot be further inherited
    final int my_will_to_live = 0; // the value for my_will_to_live is fixed and cannot be changed later
    static final int tuna_sandwich; // static blank variables can be initialized in the static block
    static {
        tuna_sandwich = 420;
    }
    final String my_future; // uninitialized final variables can only be initilaized in the constructor

    ChildC() {
        my_future = "Lol"; // final varibales initialized in the constructor
    }

    final void printAll() {
        System.out.println("Final variable = " + my_will_to_live);
        System.out.println("Final static var = " + tuna_sandwich);
        System.out.println("final uninitialized var = " + my_future);
        System.out.print("Final method (inherited from parent) = ");
        super.printMsg(); // the final method can be inherited from parent class but cannot be overridden
    }
}

class Main {
    public static void main(String[] args) {
        ChildC foo = new ChildC();
        foo.printAll();
    }
}
