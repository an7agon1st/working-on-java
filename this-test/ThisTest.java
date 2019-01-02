class ThisTest {
    int id;
    String name;

    void assignRandom() {
        this.id = 0000;
        this.name = "John Doe";
    }

    ThisTest() {
        if (id == 0 && name == null)
            this.assignRandom(); // this used here to implicitly invoke method within class
    }

    ThisTest(int id, String name) {
        this(); // calls default constructor, can also call other constructor but adding
        // parameter to ()
        // call to constructor by this should always be written first or gives an error

        this.id = id; // this here assigns value to class variable
        this.name = name; // used to refer to class variable where method variables are the same
    }

    public ThisTest thisParameterAndReturn(ThisTest tt3) {
        return this; // returns current class instance, that is tt3 here
    }

    public void printAll() {
        System.out.println("id = " + this.id);
        System.out.println("name = " + this.name);
    }
}

class Main {
    public static void main(String[] args) {
        ThisTest tt1 = new ThisTest();
        ThisTest tt2 = new ThisTest(420, "Tanzil");
        ThisTest tt3 = new ThisTest();
        tt3 = tt2.thisParameterAndReturn(tt2);
        System.out.println("\n\nObject 1");
        tt1.printAll();
        System.out.println("\n\nObject 2");
        tt2.printAll();
        System.out.println("\n\nObject 3");
        tt3.printAll();
    }
}

// (this) can be used to pass the current class instance as a parameter to a
// method
// not demonstrated in this program
