package BasicJava;

import java.util.Scanner;

public class TakeInput {
    public static  void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        int m = Integer.parseInt(sc.next()); //console
        System.out.println(m);
    }
    public static void main(String[] args) {
        input();
    }
}
