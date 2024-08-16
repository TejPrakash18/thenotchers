package BasicJava.ArraysProblem;

public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubArrays(arr);
    }

    private static void printSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.println(arr[j]+" ");
            }
            System.out.println(" ");

        }
    }
}
