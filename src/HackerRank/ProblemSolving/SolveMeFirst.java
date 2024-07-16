package HackerRank.ProblemSolving;

import java.util.Scanner;

public class SolveMeFirst {
    public static int add(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        return a+b;
    }
    public static void main(String[] args) {
        int result = add();
        System.out.println(result);
    }
}
