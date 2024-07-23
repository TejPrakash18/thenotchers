package BasicJava.Maths;

import java.util.Scanner;

public class PowerOf {
    public static int powerOf(int b, int e){
        int res = 1;
        if (e==0){
            return 1;
        }
        while(e!=0){
            res*=b;
            e--;
        }
        return res;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        int result = powerOf(base, exponent);
        System.out.println(result);
    }
}
