package BasicJava.If_else;

public class MaximumOfThree {
    public static void main(String[] args) {
        int a = 10, b=20, c= 15;
        if ((a>b) && (a>c)){
            System.out.println("A is largest");
        } else if ((b>a)&& (b>c)) {
            System.out.println("B is largest");
        }
        else {
            System.out.println("C is largest");
        }
    }
}
