package Leetcode.Arrays;

import java.util.Arrays;

public class Solution1460 {
    public static boolean Make2ArraysEqualbyReversing(int[] target, int[] arr){
        int ans=0;
        Arrays.sort(arr);
        int len = target.length;
        for(int i=0; i<target.length;i++){
            if(target[i] == arr[i]){
               ans++;
            }
        }
        if(ans == len){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] target = {392,360};
        int[] arr = {392,360};
        boolean ans = Make2ArraysEqualbyReversing(target, arr);
        System.out.println(ans);
    }
}
