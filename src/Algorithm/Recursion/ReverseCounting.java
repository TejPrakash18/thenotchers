package Algorithm.Recursion;

public class ReverseCounting {
    static void printCounting(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printCounting(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printCounting(n);
    }
}
