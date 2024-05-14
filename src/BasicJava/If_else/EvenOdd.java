package BasicJava.If_else;


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the to check number is even or odd");
        int number = scanner.nextInt();
        if (number%2!=0){
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }
}
