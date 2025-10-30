package Leetcode.TwoPointerApporach;

class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
public class TwoSum {

    public static int[] twoSumBrute(int[] arr, int tar){
        for (int i=0; i<arr.length; i++){
            int first = arr[i];
            for (int j = 0; j < arr.length; j++) {
                int pairSum  = first + arr[j];
                if (pairSum == tar){
                    return new int[]{i,j};
                }

            }
        }
        return null;

    }
    public static void main(String[] args) {
        SolutionTwoSum obj = new SolutionTwoSum();
        int arr[] = {5,2,11,7,15};
        int target = 9;
        int[] res =  obj.twoSum(arr,target);
        int[] result =  twoSumBrute(arr,target);
        for(int i=0; i<res.length; i++){
            System.out.print(result[i]+" ");


        }
    }
}
