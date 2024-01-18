package Leetcode.BitAMasking;

public class ReverseBit {
    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        System.out.println(reverseBits(n));

    }
}
