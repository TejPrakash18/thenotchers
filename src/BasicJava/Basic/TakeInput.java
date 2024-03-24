package BasicJava.Basic;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Integer number");
        int number = scanner.nextInt();
        System.out.println("Enter any String ");
        String name  = scanner.next();
        System.out.println(number);
        System.out.println(name);
    }
}
