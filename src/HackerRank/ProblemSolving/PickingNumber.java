package HackerRank.ProblemSolving;

import java.util.Scanner;

public class PickingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(pickingNumbers(a));
        scanner.close();
    }

    public static int pickingNumbers(int[] a) {
        int[] frequency = new int[101];  // Since 0 <= a[i] <= 100, create a frequency array

        // Populate the frequency array
        for (int i = 0; i < a.length; i++) {
            frequency[a[i]]++;
        }

        int maxCount = 0;

        // Iterate through the frequency array to find the maximum sum of consecutive counts
        for (int i = 1; i < 101; i++) {
            int currentCount = frequency[i] + frequency[i - 1];
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        return maxCount;
    }
}
