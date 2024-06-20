package Algorithm.Recursion;

public class PrintNToOne {
    public static void printTerm(int n){
        if(n<1) return;
        System.out.println(n);
        printTerm(n-1);
    }
    public static void main(String[] args) {
        printTerm(10);

    }
}
