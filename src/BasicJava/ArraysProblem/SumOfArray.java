package BasicJava.ArraysProblem;

public class SumOfArray {
    static int sumOfArray(int[] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }
    static double averageOfArray(int[] array){
        int sum=0;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            sum+=array[i];
        }
//        System.out.println(size);
        double avg = sum/size;
        return avg;
    }
    public static void main(String[] args) {
        int[] array = {2,5,9,11,10};
        int sum = sumOfArray(array);
        System.out.println(sum);
        double avg = averageOfArray(array);
        System.out.println(avg);

    }
}
