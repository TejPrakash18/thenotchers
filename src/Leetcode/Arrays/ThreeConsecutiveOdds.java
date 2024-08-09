package Leetcode.Arrays;

public class ThreeConsecutiveOdds {
    static boolean findOdds(int[] arr){
        int cnt= 0;

        /* corner case */
        if(arr.length <3) return false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1){
                cnt++;
                if(cnt==3) return true;
            }
            else {
                cnt=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,34,3,4,5,7,23,12};
        boolean ans = findOdds(arr);
        System.out.println(ans);

    }
}
