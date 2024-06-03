package BasicJava.Basic;

import java.util.Scanner;

public class AreaOfCircumference {
    public static void main(String[] args) {
        double PI = 3.14;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the Area of circle: ");
        int r = scan.nextInt();
        double A = (PI * r * r);
        System.out.println("Area of cirle "+A);

    }
}
