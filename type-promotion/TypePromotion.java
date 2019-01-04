/*

Author Tanzilur Rahman (an7agin1st)
Free for commercial and private use, please give appropriate credits where required

*/

class Main {
    public void Add(int a, int b) {
        System.out.println("Int arguments");
    }

    // static void adder(long a, int b) {
    // System.out.println("CT Error Ambiguity");
    // }

    // public static void adder(int a, long b) {
    // System.out.println("CT error Ambiguity");
    // }

    public static void main(String[] args) {
        Main mn = new Main();
        byte a = 9;
        byte b = 3;
        mn.Add(a, b); // gets converted/promoted to int

        // adder(765, 876);
        // gives a compile time error for ambiguity
    }
}