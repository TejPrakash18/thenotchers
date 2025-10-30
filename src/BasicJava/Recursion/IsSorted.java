package BasicJava.Recursion;

public class IsSorted {
    public static boolean isSort(int[] arr, int n){
        if(n==0 || n==1) return true;
        return arr[n-1] >= arr[n-2] && isSort(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean ans = isSort(arr, arr.length);
        System.out.println(ans);
    }
}
