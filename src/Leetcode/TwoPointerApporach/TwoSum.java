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
    public static void main(String[] args) {
        SolutionTwoSum obj = new SolutionTwoSum();
        int arr[] = {2,7,11,15};
        int target = 9;
        int[] res =  obj.twoSum(arr,target);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
}
