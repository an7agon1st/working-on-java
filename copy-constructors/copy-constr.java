class CopyConstr { // heres an interesting way to copy object values (Cpp eqv go copy constructors)
    int id;
    String name;

    CopyConstr(int x, String y) { // ok so this bit assigns the values to the instance variables
        id = x;
        name = y;
    }

    CopyConstr(CopyConstr CC) { // but this bit takes another objects and clones it to the new one. Pretty
                                // decent if you ask me
        id = CC.id;
        name = CC.name;
    }

    public void printAll() {
        System.out.println("Name = " + name);
        System.out.println("Id = " + id);
    }

}

class Main {
    public static void main(String[] args) {
        CopyConstr c1 = new CopyConstr(420, "Tanzil");
        CopyConstr c2 = new CopyConstr(c1);
        System.out.println("\n\nObject 1");
        c1.printAll();
        System.out.println("\n\nObject 2");
        c2.printAll();
    }
}