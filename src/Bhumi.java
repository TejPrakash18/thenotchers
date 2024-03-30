public class Bhumi {
    static double balance;
    double bal;

    char ch;
    int num = ch+1;
    public static void main(String[] args) {
        int num = 0;
        Bhumi obj1 = null;
        Bhumi obj2 = null;
        obj1 = new Bhumi();
        obj2 = new Bhumi();
        obj2 = obj1;
        obj1 = new Bhumi();
        System.out.println(balance);
        System.out.println(obj2.bal);
        System.out.println(num);
        System.out.println(obj2.ch);
        System.out.println(obj1.num);

    }
}
