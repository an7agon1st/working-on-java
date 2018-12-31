/*

Author Tanzilur Rahman (an7agon1st)

Feel free to correct if you see some error

*/

class Constr {
    int var1;
    int var2;
    String ex1;

    Constr() {
        System.out.println("Default constructor");
    } // i keep forgetting the syntax for constructors ever since i shifted back to
      // java from C

    Constr(int i, int j) { // constructors can be over loaded just like methods
        var1 = i;
        var2 = j;
    }

    Constr(String name, int i, int j) { // constructors are overloaded on the basis of number of parameters and
                                        // parameter types
        var1 = i;
        var2 = j;
        ex1 = name;
    }
}

class Main {
    public static void main(String[] args) {
        Constr c1 = new Constr();
        Constr c2 = new Constr(69, 420);
        Constr c3 = new Constr("Tanzil", 69, 420);
        System.out.println(c1.var1 + " " + c1.var2 + " " + c1.ex1); // nulls and 0s are initilized by the JVM for
                                                                    // default constructors
        System.out.println(c2.var1 + " " + c2.var2 + " " + c2.ex1);
        System.out.println(c3.var1 + " " + c3.var2 + " " + c3.ex1);
    }
}
