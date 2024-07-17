package HackerRank.ProblemSolving;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int p = scan.nextInt();

        int result = Math.min(p/2, n/2-p/2);

        System.out.println(result);
    }
}
