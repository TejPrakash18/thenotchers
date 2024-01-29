package Oops.Polymorphism;
class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}
public class OverrideStaticMethod {
    public static void main(String[] args) {
        Parent.staticMethod();  // Calls static method in Parent class
        Child.staticMethod();   // Calls static method in Child class

        // Using reference type to demonstrate method hiding
        Parent reference = new Child();
        reference.staticMethod();  // Calls static method in Parent class (compile-time decision)
    }
}
