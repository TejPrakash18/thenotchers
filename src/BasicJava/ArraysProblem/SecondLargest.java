package BasicJava.ArraysProblem;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,9,11,18,33};

        int ans = secondLargest(arr);
        System.out.print("Second largest number is "+ ans);
         
    }

    private static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                ans = largest;
                largest = arr[i];
            }
        }
        return ans;
    }
}
