class Aggregation {

    static int agg = 0;

    Aggregation() {
        agg++;
        System.out.println("This is Aggregation, object used in a different class");
    }
}

class AggExample {
    Aggregation ag = new Aggregation(); // creating an instance of the class Aggregation in another class AggExample

    AggExample() {
        System.out.println("This class accesses that via objects");
    }
}

class Main {
    public static void main(String[] args) {
        AggExample foo = new AggExample();
    }
}