package BasicJava.ArraysProblem;

public class PrintSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        printSubArraySum(arr);
    }

    private static void printSubArraySum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                System.out.println(sum+" ");
            }
            System.out.println("\n");
        }
    }
}
