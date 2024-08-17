package Leetcode.Arrays;


import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> mp = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (!mp.containsKey(nums[i])) {
                mp.put(nums[i], i);
            } else {
                int pastIndex = mp.get(nums[i]);
                if (Math.abs(pastIndex - i) <= k) {
                    return true;
                } else {
                    mp.put(nums[i], i);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
        int k =1;
//        int length = args.length;
        boolean answer = containsNearbyDuplicate(arr, k);
        System.out.println(answer);

    }
}
