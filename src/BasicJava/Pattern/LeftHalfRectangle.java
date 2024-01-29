package BasicJava.Pattern;

import java.util.Scanner;

public class LeftHalfRectangle {
    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many test cases run on");
        t=sc.nextInt();
        System.out.println("Rectangle size ");
        for(int i=0;i<t;i++ ) {
            int n;
            n = sc.nextInt();
            print(n);
        }
    }
}
