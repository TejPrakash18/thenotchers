package DataStructure.Arrays;

public class InsertAtPosition {
    public static int[] insertAtPosition(int[] arr , int pos, int key){
        int length = arr.length;
        int newLength = length+1;
        int[] newArray = new int[newLength];

        for (int i = length-1; i >=pos; i--) {
            newArray[i+1] = arr[i];
        }
        newArray[pos] = key;
        for (int j=pos-1; j>=0; j--){
            newArray[j] = arr[j];
        }
        return newArray;

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 12, 34, 10, 6, 40 };
        int pos = 3;
        int key = 11;

        int pos1= 2;
        int key1 = 17;
        print(arr);
        int[] answer = insertAtPosition(arr, pos, key);
        System.out.println("\ninsert ann element; ");
        print(answer);
        int[] answer1 = insertAtPosition(answer,pos1, key1);
        System.out.println(" \n--------- ");
        print(answer1);

    }
}
