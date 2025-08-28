package collection.arraysAlgos;
import java.util.Arrays;
import java.util.Collections;

public class ArraysExamples {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};




        Arrays.sort(numbers);  // ascending
        System.out.println(Arrays.toString(numbers));

        //Binary Search
        int index = Arrays.binarySearch(numbers, 1);
        System.out.println(index);
        System.out.println(Arrays.binarySearch(numbers, 5));


        Integer[] numbersObj = {5, 2, 9, 1, 7};
        Arrays.sort(numbersObj, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(numbersObj));



        String[] names = {"John", "Alice", "Bob"};
        Arrays.sort(names);  // natural order
        System.out.println(Arrays.toString(names));

        Arrays.sort(names, (a, b) -> b.compareTo(a)); // descending order
        System.out.println(Arrays.toString(names));
    }
}
