package BasicJava.ArraysProblem;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printMax(arr);
    }

    private static void printMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum>max){
                    max= sum;
                }
            }
        }
        System.out.println("max is sub array sum "+max);
    }
}
