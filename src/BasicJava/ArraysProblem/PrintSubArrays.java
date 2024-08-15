package BasicJava.ArraysProblem;

public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubArrays(arr);
    }

    private static void printSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                System.out.print(sum+" ");
            }
            System.out.println(" ");

        }
    }
}
