package BasicJava.If_else;

import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a>b) && (a>c)){
            System.out.println("A is largest");
        } else if ((b>a)&& (b>c)) {
            System.out.println("B is largest");
        }
        else {
            System.out.println("C is largest");
        }
    }
}
