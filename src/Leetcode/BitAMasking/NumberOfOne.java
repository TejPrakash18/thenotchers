package Leetcode.BitAMasking;

public class NumberOfOne {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(000000011011011));
    }
}
