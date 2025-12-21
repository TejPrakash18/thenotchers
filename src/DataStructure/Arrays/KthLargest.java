package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k=2;
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
    }
}
