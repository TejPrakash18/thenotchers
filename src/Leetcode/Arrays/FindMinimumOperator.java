package Leetcode.Arrays;

public class FindMinimumOperator {
    static int findOperator(int[] arr){
        int cnt=0;
        for(int i = 0; i< arr.length; i++){
            if (arr[i]%3!=0){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
        int[] arr = {3,6,9};

        int ans = findOperator(arr);
        System.out.println(ans);
    }
}
