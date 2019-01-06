/*
*   Auhtor Tanzilur Rahman (an7agon1st)
*   Free for educational use
*
*   instanceof opeartor returns true or false if an object if an instance of the mentioned class or not 
*   SYNTAX: OBJECT instanceof CLASS
*   if an OBJECT=null, it returns false
*   
*   Downcasting is refereing a superclass object by a subclass variable
*
*/

class Dom {
}

class Sub extends Dom {
    static void downCast(Dom d) {
        if (d instanceof Sub) {
            Sub s = (Sub) d;
            // the object Dom d was a superclass ref var but was pointing to a subclass
            // object Sub
            // hence it was typecasted AND downcasted to a Subclass reference variable s
            System.out.println("Downcasted Ma Man");
        }
    }
}
// }

class Main {
    public static void main(String[] args) {
        Dom d = new Sub(); // upcasted
        Sub.downCast(d);
    }
}