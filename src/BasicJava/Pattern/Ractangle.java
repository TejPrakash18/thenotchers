package BasicJava.Pattern;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ractangle {
    public static void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print1(int n){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
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
        for(int i=0;i<t;i++ ){
            int n;
            n= sc.nextInt();
//            print(n);
        }

//        print1(4);

    }
}
