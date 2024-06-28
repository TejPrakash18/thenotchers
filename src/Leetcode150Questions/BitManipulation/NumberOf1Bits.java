package Leetcode150Questions.BitManipulation;

public class NumberOf1Bits {
    public static void main(String[] args) {
       int n =11;
       int ans = bits(n);
        System.out.println(ans);
    }

    private static int bits(int n) {

        int cnt=0;
        while(n!=0){
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }
}
