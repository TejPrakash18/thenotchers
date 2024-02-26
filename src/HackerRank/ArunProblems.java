package HackerRank;

import java.util.Scanner;

public class ArunProblems {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int can = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                can = arr[i];
                count = 1;
            } else if (arr[i] == can) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == can) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.print(can);
        } else {
            System.out.println(-1);
        }
    }
}



