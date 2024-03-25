package BasicJava.ArraysProblem;

public class MissingValue {
    public static int missingValue(int[] array, int n){
        int N = n+1;
        int sumOfN = (N*(N+1))/2;
        int sumOfArray =0;

        for (int i = 0; i < array.length; i++) {
            sumOfArray+=array[i];
        }

        return sumOfN-sumOfArray;
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6};
        int n =4;
        int missingNumber = missingValue(array,n);
        System.out.println(missingNumber);
    }
}

