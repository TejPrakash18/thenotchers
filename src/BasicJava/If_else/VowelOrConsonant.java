package BasicJava.If_else;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to want vowel or consonant");
        char character = scanner.next().toLowerCase().charAt(0);
        if (character == 'a' || character == 'e'|| character == 'i'|| character == 'o'|| character == 'u'){
            System.out.println("character is vowels");
        }
        else {
            System.out.println("character is consonant");
        }

    }
}
