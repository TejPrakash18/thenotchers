package BasicJava.ArraysProblem;

public class ReverseArray {
    public static void reverse(int[] array){
        int startIndex = 0;
        int lastIndex = array.length-1;

        while(startIndex<lastIndex){
            int temp = array[startIndex];
            array[startIndex] = array[lastIndex];
            array[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }

    public static  void reverseArray(int[] arr){
        int[] newArray = new int[arr.length];
        int i=0;
        for(int j= arr.length-1; j>=0; j--){
            newArray[i] =  arr[j];
            i++;
        }
        System.out.println("\nReverse array :)");
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] array = {2,5,7,9,12};
        reverse(array);
        int [] array1 = {2,3,7,9,12};
        reverseArray(array1);
    }
}
