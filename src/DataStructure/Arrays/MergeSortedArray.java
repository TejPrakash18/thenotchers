package DataStructure.Arrays;

public class MergeSortedArray {
    public static int[] mergeSortedArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] mergeArray = new int[m+n];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m){
            if(arr1[i] < arr2[j]){
                mergeArray[k++] = arr1[i++];
            }
            else{
                mergeArray[k++] = arr2[j++];
            }
        }
        while( j < m){
            mergeArray[k++] = arr2[j++];
        }
        while( i < n){
            mergeArray[k++] = arr1[i++];
        }


        return mergeArray;

    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,5,6};

        int[] mergeArray = mergeSortedArray(arr1, arr2);

        for (int num :mergeArray){
            System.out.println(num +" ");
        }
    }
}
