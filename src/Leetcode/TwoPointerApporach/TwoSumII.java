package Leetcode.TwoPointerApporach;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;

        while(i<j){
            if(numbers[i]+numbers[j] == target){
                break;
            }
            if(numbers[i]+numbers[j] > target){
                j--;
                continue;
            }
            i++;
        }
        return new int[]{i+1,j+1};
    }
}
public class TwoSumII {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        Solution objSolution = new Solution();
       int[] res =  objSolution.twoSum(arr,target);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
}
