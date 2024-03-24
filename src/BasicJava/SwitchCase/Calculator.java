package BasicJava.SwitchCase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println("Enter the operator");
        char operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("Addition "+ (firstNumber+secondNumber));
                break;
            case '-':
                System.out.println("Subtraction "+ (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Multiply "+ (firstNumber*secondNumber));
                break;
            case '/':
                System.out.println("Divide "+ (firstNumber/secondNumber));
                break;
            case '%':
                System.out.println("Module "+(firstNumber % secondNumber));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
