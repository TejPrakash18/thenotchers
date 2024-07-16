package HackerRank.ProblemSolving;

import java.util.Scanner;

public class DivisibleSumPairs {
    public static int countSumOfPairs(int ar[] , int k) {
        int cnt = 0;
        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < ar.length; j++) {
                sum = ar[i] + ar[j];
                if (sum % k == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();

            int k = scanner.nextInt();


            int ar[] = new int[size];

            for(int i=0; i<ar.length; i++){
                ar[i] = scanner.nextInt();
            }

            int result = countSumOfPairs(ar, k);
            System.out.println(result);
    }
}
