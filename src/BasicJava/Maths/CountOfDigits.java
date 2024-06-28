package BasicJava.Maths;

public class CountOfDigits {
    public static void main(String[] args) {
        int cnt =0;
        int n = 7 ;
        while(n!=0){
            n=n/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
