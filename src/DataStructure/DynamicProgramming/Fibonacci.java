package DataStructure.DynamicProgramming;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        ArrayList<Integer> arrDp = new ArrayList<>(n+1);

        for (int i = 0; i <= n; i++) {
            arrDp.add(-1);
        }

        int ans = fib(n, arrDp);
        System.out.println(ans);
    }


    private  static int fibo(){
        ArrayList<Integer> listOfDp = new ArrayList<>();


        return 0;
    }
    private static int fib(int n, ArrayList<Integer> arrDp) {
        if(n==1 || n==0){
            return n;
        }
        if(arrDp.get(n)!=-1){
            return arrDp.get(n);
        }

        arrDp.set(n, fib(n - 1, arrDp) + fib(n - 2, arrDp));
        return arrDp.get(n);
    }
}
