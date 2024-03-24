package BasicJava.Basic;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("Before swapping!");
        System.out.println(a +" "+ b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping!");
        System.out.println(a +" "+ b);
    }
}
