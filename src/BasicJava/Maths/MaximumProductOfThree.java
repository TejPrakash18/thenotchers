package BasicJava.Maths;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOfThree {
    public static int maximum(int[] arr, int n){
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1], arr[n-1]*arr[n-2]*arr[n-3]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int result = maximum(arr, n);
        System.out.println(result);
    }
}
