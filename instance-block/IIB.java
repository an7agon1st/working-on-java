/*

Author Tanzilur Rahman (an7agon1st)

member of Namak

*/

class SuperC {
    SuperC() {
        System.out.println("Parents Constructor Initialized"); // then this #2
    }

    {
        System.out.println("Parents IIB Triggered"); // this is triggered first #1
    }
}

class ChildC extends SuperC {
    ChildC() {
        super();
        System.out.println("Child Constructor Initialized"); // and then this #4
    }

    {
        System.out.println("Child IIB Triggered"); // then this #3
    }
}

class Main {
    public static void main(String[] args) {
        ChildC foo = new ChildC(); // only the child Constructor is called
    }
}