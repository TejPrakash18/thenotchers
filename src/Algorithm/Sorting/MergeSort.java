package Algorithm.Sorting;

public class MergeSort {
    public static void merge(int[] arr, int low, int mid,  int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int lA[] = new int[n1];
        int rA[] = new int[n2];

//        while ()


    }
    public static void mergeSort(int[] arr,int low, int high){
       if (low < high){
           int mid = (low+high)/2;
           //left sort
           mergeSort(arr,low,mid);
           //right sort
           mergeSort(arr,mid+1,high);
           //merge sorted array
           merge(arr,low, mid, high);
       }


    }
    public static void main(String[] args) {
        int[] arr = {9,5,2,6,7,11};
        mergeSort(arr,0,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }
}
