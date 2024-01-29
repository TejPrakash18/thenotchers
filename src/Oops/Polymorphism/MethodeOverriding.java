package Oops.Polymorphism;


class Calculation{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    double add( double a, int b){
        return a+b;
    }
}
public class MethodeOverriding {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        obj.add(2,4);
        obj.add(3,4,5);
        double res = obj.add(2.3, 5);
        System.out.println(res);

    }
}
