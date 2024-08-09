package Leetcode.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution1460 {
    public static boolean Make2ArraysEqualbyReversing(int[] target, int[] arr){
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target,arr);
    }
    public static void main(String[] args) {
        int[] target = {392,360};
        int[] arr = {392,360};
        boolean ans = Make2ArraysEqualbyReversing(target, arr);
        System.out.println(ans);
    }
}
