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
    public static void main(String[] args) {
        int[] array = {2,5,7,9,12};
        reverse(array);
    }
}
