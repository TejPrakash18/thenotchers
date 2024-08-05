package Leetcode150Questions.KadanesAlgo;

public class MaximumSumCircularSubArray {
    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMaxSum = 0;
        int currMinSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            totalSum = totalSum+nums[i];

            currMaxSum = Math.max(currMaxSum+nums[i],nums[i]);
            currMinSum = Math.min(currMinSum+nums[i],nums[i]);
            minSum = Math.min(minSum,currMinSum);
            maxSum = Math.max(maxSum, currMaxSum);
        }
        return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
    }
    public static void main(String[] args) {

        int[] arr = {1,-2,3,-2};

       int ans=  maxSubarraySumCircular(arr);
        System.out.println(ans);

    }
}
