package DataStructure.Arrays;

public class KadanesAlgo {
    public static void printSubArray(int[] nums){

        for (int s = 0; s < nums.length; s++) {
            int sum=0;
            for (int e = s; e < nums.length; e++) {

                for (int i = s; i <=e ; i++) {
                    System.out.print(" "+nums[i]);
                    sum+=nums[i];
                }
                System.out.print(" "+"sum: "+sum);

                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        printSubArray(number);
    }
}
