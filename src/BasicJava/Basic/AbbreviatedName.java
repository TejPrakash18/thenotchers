package BasicJava.Basic;

import java.util.Scanner;

public class AbbreviatedName {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scnr.next();
        System.out.print("Enter your middle name: ");
        String middleName = scnr.next();
        System.out.print("Enter your last name: ");
        String lastName = scnr.next();

        String abbreviatedName = "";
        if (!middleName.isEmpty()) {
            abbreviatedName += Character.toUpperCase(firstName.charAt(0)) + ". ";
            abbreviatedName += Character.toUpperCase(middleName.charAt(0)) + ". ";
        }
        abbreviatedName += lastName;

        System.out.println("Abbreviated Name: " + abbreviatedName);
    }
}