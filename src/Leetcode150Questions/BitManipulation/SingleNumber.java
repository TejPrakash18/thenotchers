package Leetcode150Questions.BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {2,2,1};
        int ans = 0;
        for(int i:arr){
            ans^=i;
        }
        System.out.println(ans);
    }
}
