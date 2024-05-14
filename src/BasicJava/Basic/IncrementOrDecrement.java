package BasicJava.Basic;

class Number{
    int x;
    void store(Number num){
        num.x++;
    }
}
public class IncrementOrDecrement {

    public static void main(String[] args) {

        Number num = new Number();
        num.x=10;
        num.store(num);
        System.out.println(num.x);


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

        int mm = 0;
        loop1: for (int i = 0; i < 10; i++) {
            System.out.println(i + "i : " + mm);
            loop2: for (int j = 0; j < 10; j++) {
                System.out.println(j + "j : " + mm);
                loop3: for (int k = 0; k < 10; k++) {
                    System.out.println(k + "k : " + mm);
                    System.out.println(++mm);
                    if (k % 10 == 0) {
                        continue loop2;
                    }
                }
            }
        }


    }
}
