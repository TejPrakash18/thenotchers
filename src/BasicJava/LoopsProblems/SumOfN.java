package BasicJava.LoopsProblems;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number to want print Sum of N.");
        int number = scanner.nextInt();
        System.out.println("Sum of N natural number");
        for (int i = 1; i <= number; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
