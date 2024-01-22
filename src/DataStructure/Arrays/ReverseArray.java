package DataStructure.Arrays;

public class ReverseArray {
    public static void print(int arr[]){
        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,3,1};
        int arr1[] = {5,4,8,7};
        print(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        print(arr1);
        for (int i :arr1) {
            System.out.print(i+" ");
        }
    }
}
