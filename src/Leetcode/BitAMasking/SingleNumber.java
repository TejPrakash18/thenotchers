package Leetcode.BitAMasking;


public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }

        return ans;

    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{1}));
    }

}
