package Leetcode.Arrays;

import java.util.HashSet;

public class DistibuteCandys {
    public static int distributeCandies(int[] candyType) {
        int len = candyType.length;
        HashSet<Integer> st = new HashSet<>();
        for(int data : candyType){
            st.add(data);
        }
        int m = st.size();
        return Math.min(m, len/2);

    }
    public static void main(String[] args) {
        int[] nums ={1,1,2,2,3,3};
        int answer = distributeCandies(nums);
        System.out.println(answer);

    }
}
