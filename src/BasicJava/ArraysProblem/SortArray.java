package BasicJava.ArraysProblem;

import java.util.Collections;

public class SortArray {
    static void sortArray(int[] array){

        for (int i=0; i< array.length;i++){
            for (int j = 0; j < array.length; j++) {
                System.out.println("index numbers or each is i, j " + i +" "+ j  );
            }
        }
//        for (int i=0; i< array.length;i++){
//            for (int j = 0; j < array.length; j++) {
//                if(array[i] < array[j]){
//                    int temp = array[j];
//                    array[j] = array[i];
//                    array[i] = temp;
//                }
//            }
//        }
//        System.out.println("Ascending order ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }
    }
    public static void main(String[] args) {
        int[] array = {1,9,7,6,5};
        sortArray(array);
    }
}



//static void sortArray(int[] array){
//    for (int i=0; i< array.length;i++){
//        for (int j = 0; j < array.length; j++) {
//            if(array[i] > array[j]){
//                int temp = array[j];
//                array[j] = array[i];
//                array[i] = temp;
//            }
//        }
//    }
//    System.out.println("Descending order ");
//    for (int i = 0; i < array.length; i++) {
//        System.out.print(array[i]+" ");
//    }
//}
