package Leetcode.BitAMasking;

public class CountingBit {

    public static int[] countBits(int n) {
        int res[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                res[i] = res[i / 2];
            } else {
                res[i] = res[i / 2] + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countBits(n));

    }
}
