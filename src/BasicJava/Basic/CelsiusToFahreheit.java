package BasicJava.Basic;

import java.util.Scanner;

public class CelsiusToFahreheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature !");
        double temperature = scanner.nextDouble();

        double celsius = (9/5) * temperature +32;
        System.out.println("Convert temperature celsius to fahrenheit " + celsius);
    }
}
