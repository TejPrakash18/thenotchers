package BasicJava.Basic;

public class IncrementOrDecrement {
    public static void main(String[] args) {
        int x, m,n;
        m = 10;
        n = 15;
        x = ++m + n++;
        System.out.println("x "+ x);
        System.out.println("m "+ m);
        System.out.println("n "+ n);

        System.out.println("---------");
        int y = 9;
        System.out.println(y++); //9
        System.out.println(y); //10
        System.out.println(++y); //11


    }
}
