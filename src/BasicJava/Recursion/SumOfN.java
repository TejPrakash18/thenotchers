package BasicJava.Recursion;

public class SumOfN {
    static int sum(int number){
        if (number==1){
            return 1;
        }
        else
            return number + sum(number-1);
    }
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }
}
