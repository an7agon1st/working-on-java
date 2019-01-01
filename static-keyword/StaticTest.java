class StaticTest1 {
    int nsCount = 0;
    static int sCount = 0; // gets initialized at class loading, common for all objects

    StaticTest1() {
        nsCount++;
        sCount++;
        System.out.println("Non static " + nsCount);
        System.out.println("Static " + sCount);
    }

    static void printAll() { // static method
        // System.out.println(nsCount);
        // can't access nonStatic hence commented
        System.out.println("Final Static " + sCount); // can access static
    }
}

class Main {
    public static void main(String[] args) {
        StaticTest1 st1 = new StaticTest1();
        StaticTest1 st2 = new StaticTest1();

        StaticTest1.printAll(); // accessing a static method without using object

    }
}