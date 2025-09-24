package Oops.constructor.inhertance;

class A {
    static {
        System.out.println("A.static");
    }

    {
        System.out.println("A.instance");
    }

    A() {
        System.out.println("A.<init>");
    }
    A(String name){
        System.out.println("Hello, "+ name);
    }
}

class B extends A {
    static {
        System.out.println("B.static");
    }
    {
        System.out.println("B.instance");
    }
    B() {
//        super();
        super("Tej");
        System.out.println("B.<init>");
    }
}

public class CtorOrder {
    public static void main(String[] args) {
        new B();
//        new B();
    }
}

