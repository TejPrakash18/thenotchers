package Algorithm.Sorting;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                 min = j;
                }
            }
            if (min !=i){
                swap(arr, i, min);
            }
        }
    }

    public static void  swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,3,8};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" ");

        }
    }
}
