package DataStructure.Arrays;

public class DeleteElementAtPosition {
    static int[] deleteElement(int[] arr, int pos) {
        if (pos < 0 || pos >= arr.length) {
            throw new IllegalArgumentException("Position out of bounds");
        }

        for (int i = pos; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1]=0;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,40,18,12};
        int pos = 4;
        System.out.println("original array ");
        for (int data1: arr){
            System.out.print(data1+" ");
        }

        deleteElement(arr,pos);
        System.out.println("\n after delete element at given position");
        for (int data:arr){
            System.out.print(data+" ");
        }
    }
}
