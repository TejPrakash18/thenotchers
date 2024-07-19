package BasicJava.ArraysProblem;

import java.util.Scanner;

public class MinMax {
    public static void minMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            else {
                min = arr[i];
            }
        }
        System.out.println("Min"+ min + "  "+ "max"+max);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        minMax(arr);
    }
}
