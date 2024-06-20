package Algorithm.Recursion;

public class PrintLinearly {
    public static void printOneToN(int i, int n){
        if(i>n) return;
        System.out.println(i);
        printOneToN(i+1, n);
    }
    public static void main(String[] args) {

        printOneToN(1, 10);
    }
}
