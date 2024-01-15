package BasicJava.Operators;

public class IncrementOrDecrement {
    public static void main(String[] args) {

        int x = 5;
        System.out.println("Original Value"+x);
        // Post-increment: value is used first, then incremented
        int y = x++;
        // y is assigned the current value of x (5), and then x is incremented to 6
        System.out.println("Post Increment "+y);
        // Pre-increment: variable is incremented first, then its value is used
        int z = ++x;
        // x is incremented to 7, and then z is assigned the new value of x (7)
        System.out.println("Pre increment "+z);




        int a = 8;
        System.out.println("Original Value"+a);
        // Post-decrement: value is used first, then decremented
        int b = a--;
        // b is assigned the current value of a (8), and then a is decremented to 7
        System.out.println("Post Decrement "+b);

        // Pre-decrement: variable is decremented first, then its value is used
        int c = --a;
        // a is decremented to 6, and then c is assigned the new value of a (6)
        System.out.println("Pre Decrement "+c);

    }
}
