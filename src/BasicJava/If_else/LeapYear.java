package BasicJava.If_else;

import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Year is leap");
        }
        else {
            System.out.println("year is non-leap");
        }
    }
}
