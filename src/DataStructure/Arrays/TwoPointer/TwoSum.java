package DataStructure.Arrays.TwoPointer;

public class TwoSum {
    public static void twoSum(int[] numbers,int target){
        int p1 = 0;
        int p2 = numbers.length-1;
        System.out.println(p2);

        while (p1 < p2){
            if(numbers[p1] + numbers[p2] == target){
                System.out.println(( p1+1 )+" "+( p2+1));
            }
            if(numbers[p1] + numbers[p2] > target){
                p2--;
            }
            else{
                p1++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,25,75};
        int target = 100;
        twoSum(arr,target);
    }
}

