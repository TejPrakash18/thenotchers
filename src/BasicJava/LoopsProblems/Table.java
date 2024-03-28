package BasicJava.LoopsProblems;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to want print table ");
        int number = scanner.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(i+" * "+number+" = "+(i*number));
        }
    }
}
