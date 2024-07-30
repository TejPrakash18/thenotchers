package Algorithm.Recursion;

public class ReverseCounting {
    static void printCountingReverse(int n){
        // tail recursion
        if(n==0) return;
        System.out.print(n+" ");
        printCountingReverse(n-1);
    }

    static void printCounting(int n){
        //head recursion
        if(n==0) return;
        printCounting(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n=10;
        printCounting(n);
        System.out.println();
        printCountingReverse(n);
    }
}
