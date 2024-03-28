package BasicJava.LoopsProblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the to want print Factorial");
        int number = scanner.nextInt();
        for (int i = number; i >0; i--) {
            fact = fact * i;
            number--;
        }
        System.out.println(fact);

    }
}
