package BasicJava.Maths;

import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
    static void password(int number){
        Random random = new Random();
        StringBuilder password = new StringBuilder(number);
        for (int i = 0; i < number; i++) {
            int index =  random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
            
        }
        System.out.println(password);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        password(num);

    }
}
