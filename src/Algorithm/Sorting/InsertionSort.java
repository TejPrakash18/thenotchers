package Algorithm.Sorting;

public class InsertionSort {
    public static void sort(int[] arr){
        for(int i=1;i< arr.length; i++){
            int val = arr[i];
            int j;
            for (j = i-1; j >=0 ; j--) {
                if (arr[j]>val){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }

            arr[j+1]= val;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,3,8};
        sort(arr);
    }
}
