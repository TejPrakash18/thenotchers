package HackerRank.ProblemSolving;

import java.util.Scanner;

public class SubArrayDivision {
    public static int birthday(int[] s, int d, int m) {
        int count = 0;

        for (int i = 0; i <= s.length - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s[i + j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }

        int d = scanner.nextInt();
        int m = scanner.nextInt();

        int result = birthday(s, d, m);
        System.out.println(result);

        scanner.close();
    }
}
