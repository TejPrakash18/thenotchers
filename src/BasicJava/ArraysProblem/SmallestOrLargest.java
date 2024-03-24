package BasicJava.ArraysProblem;

public class SmallestOrLargest {
    public static void smallerOrLarger(int[] array){
        int small = array[0];
        int larger = array[0];
        for(int i=1; i<array.length; i++){
            if(small > array[i]){
                small = array[i];
            }
            if (larger < array[i]){
                larger = array[i];
            }
        }
        System.out.println("Smallest value "+ small);
        System.out.println("Largest value "+ larger);
    }
    public static void main(String[] args) {
        int[] array = {5,2,9,11,8};
        smallerOrLarger(array);
    }
}
