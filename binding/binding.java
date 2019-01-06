/*
*       Author: Tanzilur Rahman (an7agon1st)
*   free for educational use
*
*   Binding: connecitng a method call to the method body
*
*   Static binding: object identified with its type at the time if compilation (early binding)
*
*   Dynammic Binding: object is identified with the type at runtime (late binding)
*
*/

class StatBind {
    StatBind() {
        System.out.println("Statically binded");
    }
}

class DynBind extends StatBind {

    DynBind() {
        System.out.println("Dynamically Binded");
    }
}

class Main {
    public static void main(String[] args) {
        StatBind foo = new StatBind(); // statically binded
        StatBind foo2 = new DynBind(); // dynamically binded
    }
}