package Leetcode.BitAMasking;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int n = arr.length+1;
        int xor = 0;

        // XOR all array elements
        for (int num : arr) {
            xor ^= num;
        }
        System.out.println(xor);

        // XOR with numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        return xor; // This is the missing number
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println("Missing Number: " + missingNumber(arr));
        System.out.println("Hello Tej!");

    }
}
