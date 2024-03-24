package BasicJava.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day");
        String weekDay = scanner.next().toLowerCase();

        switch (weekDay){
            case "sunday":
                System.out.println("Today is Sunday");
                break;
            case "monday":
                System.out.println("Today is Monday");
                break;
            case "tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "thursday":
                System.out.println("Today is Thursday");
                break;
            case "friday":
                System.out.println("Today is Friday");
                break;
            case "saturday":
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
