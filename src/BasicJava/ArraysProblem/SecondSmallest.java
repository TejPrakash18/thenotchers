package BasicJava.ArraysProblem;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10,3,5,11,18};
        int ans = findSecondSmallest(arr);
        System.out.println("second smallest number "+ans);
    }

    private static int findSecondSmallest(int[] arr) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for (int i=0; i<arr.length;i++){
            if(arr[i] < small){
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i]!=small) {
                secondSmall = arr[i];

            }
        }
        return secondSmall;
    }
}
