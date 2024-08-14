package DataStructure.Arrays;

public class InsertAtEnd {
    public static int[] insertElement(int[] arr , int element){
        int length = arr.length;
        int newLength = length+1;
        int[] newArray = new int[newLength];

        for (int i = 0; i < length; i++) {
            newArray[i] = arr[i];
        }
        newArray[length] = element;

        return newArray;
    }
    public static void main(String[] args) {
        int arr[] = { 12, 34, 10, 6, 40 };
        int add =  26;
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" ");
        }

        System.out.println(" after insert element");

        int[] ans = insertElement(arr, add);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
