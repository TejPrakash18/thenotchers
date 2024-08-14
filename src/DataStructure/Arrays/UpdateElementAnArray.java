package DataStructure.Arrays;

public class UpdateElementAnArray {
    static int[] update(int[] arr, int pos, int key){
        for (int i=0; i<arr.length; i++){
            if (i == pos){
                arr[i] = key;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={12,10,30,22,26};
        int pos = 3;
        int element = 13;

        update(arr, pos, element);
        for (int data : arr){
            System.out.print(data+" ");
        }
    }
}
