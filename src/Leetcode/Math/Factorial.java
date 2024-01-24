package Leetcode.Math;

public class Factorial {
    public static void fact(int num){
        int fc = 1;
        while (num>=1){
            fc = fc*num;
            num--;
        }
        System.out.println("factorial: "+fc);
    }
    public static void main(String[] args) {
        int number = 5;
        fact(number);

    }
}
