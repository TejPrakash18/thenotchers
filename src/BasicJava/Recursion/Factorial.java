package BasicJava.Recursion;

public class Factorial {
    public static int fact(int n){
        if (n==0) return 1;
        if (n==1) return 1;
        int smallProblem = fact(n-1);
        return n* smallProblem;
//        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int ans = fact(10);
        System.out.println(ans);
    }
}
