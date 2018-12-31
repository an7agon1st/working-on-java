/*
Written by an7agon1st (Tanzilur Rahman)

testing out java objects and variable scopes



*/

class ObjTest {
    private int i;

    void setInt(int kk) {
        i = kk;
    }

    int retInt() {
        return i;
    }
}

class Main {
    public static void main(String[] args) {
        ObjTest o1 = new ObjTest();
        // ObjTest o2 = new ObjTest();
        o1.setInt(69);
        // o2.i = 420; //since i is private it cannot be accessed outside the class
        System.out.println("" + o1.retInt());
        // System.out.println("" + o2.i); //hence its protected by the method that is
        // used to define values to it

    }
}
