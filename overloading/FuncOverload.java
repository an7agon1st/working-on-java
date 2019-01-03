class OverLoadingNP {
    // method for printing
    public void printIt(int a, int b) {
        System.out.println("Two parameter method");
    }

    // overloading same method by no of parameters
    public void printIt(int a, int b, int c) {
        System.out.println("Three parameter method");
    }
}

class OverLoadingTP {
    // method for printing
    public void printIt(int a) {
        System.out.println("Integer argument method");
    }

    // overloading by argument
    public void printIt(String s) {
        System.out.println("String argument method (String:" + s + ")");
    }
}

class Main {
    public static void main(String[] args) {
        OverLoadingNP foo1 = new OverLoadingNP();
        OverLoadingTP foo2 = new OverLoadingTP();
        foo1.printIt(1, 2);
        foo1.printIt(1, 2, 3);
        foo2.printIt(2);
        foo2.printIt("Tanzil");
    }
}