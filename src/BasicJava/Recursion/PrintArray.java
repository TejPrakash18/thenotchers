package BasicJava.Recursion;

public class PrintArray {
    public static void print(int[] arr, int n){
        if(n>=arr.length) return;
        System.out.print(arr[n]+" ");
        print(arr, n+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,2,4,5,6,78,9};
        print(arr, 0);
    }
}
