class PapiClass {
    void printMsgP() {
        System.out.println("This is in the parent class");
    }
}

class BabyClass extends PapiClass { // inheriting the PapiClass thats the parent class
    void printMsgC() {
        System.out.println("This is the child class");
    }
}

class MultiLevelClass extends BabyClass { // multilevel inheritance in class. This is the third level inheritance
    void printMsgM() {
        System.out.println("This is a multilevel class");
    }
}

class Main {
    public static void main(String[] args) {
        MultiLevelClass ml = new MultiLevelClass();
        ml.printMsgC();
        ml.printMsgP();
        ml.printMsgM();
    }
}

// Multiple and hybrid (one class inheriting more than one) is not supported in
// java throught classes and is instead supported through interfaces

// program structure
//
//
// Papi class
// /\
// BabyClass
// /\
// MultiLevelClass