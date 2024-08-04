package Algorithm.Searching;

public class BinarySearch {
    static int findElement(int[] arr, int target){
        int s = 0;
        int e = arr.length;
        while (s<=e){
            int mid  = (s+e)/2;
            if(arr[mid] == target){
                return mid;
            } else if (target > mid) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7,11,15,19,23};
        int target = 23;
        int ans  = findElement(arr, target);
        System.out.println("Element found at index "+ans);
    }
}
