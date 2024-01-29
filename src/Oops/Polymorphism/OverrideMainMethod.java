package Oops.Polymorphism;

public class OverrideMainMethod {

    // always consider the string[] args method
    public static void main(String[] args) {
        System.out.println("Main method with String array parameter");
    }

    public static void main(String arg) {
        System.out.println("Overloaded main method with a different parameter");
    }

    public static void main(int num) {
        System.out.println("Another overloaded main method with a different parameter");
    }
}
