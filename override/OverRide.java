class Ride {
    void overRide() {
        System.out.println("Normally the method would print this");
    }
}

class OverRide extends Ride {
    void overRide() {
        System.out.println("But this method overrides it instead");
    }
}

class Main {
    public static void main(String[] args) {
        OverRide foo = new OverRide();
        foo.overRide();
    }
}