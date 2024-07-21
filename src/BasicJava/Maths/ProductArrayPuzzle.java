package BasicJava.Maths;

import java.util.Scanner;

public class ProductArrayPuzzle {
    public static void productArray(int[] arr, int size){
        int[] newArray = new int[size];
        int product =1;
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = product/arr[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        productArray(arr , size);
    }
}
