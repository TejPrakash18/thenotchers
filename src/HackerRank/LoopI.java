package HackerRank;

import java.util.Scanner;

public class LoopI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            int res = n*i;
            System.out.println(n +" x " + i + " = " +res);
        }
        sc.close();
    }
}
