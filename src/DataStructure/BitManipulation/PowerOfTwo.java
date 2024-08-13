package DataStructure.BitManipulation;

public class PowerOfTwo {
    public static boolean powerOf2(int n){
        if ((n & n-1)==0){
            return true;
        }

        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 16;
        boolean ans = powerOf2(n);
        System.out.println(ans);
    }
}
