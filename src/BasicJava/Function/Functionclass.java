package BasicJava.Function;

public class Functionclass {
    public static int showDisplay(int a,int b){
        System.out.println("Hello I'm java");
        return a+b;
    }
    public int add(int a,int b){
        return a+b;
//        System.out.println("hello");
    }
    public static int add(int a, int b, int c){
        int res = a+b+c; //12.0
        return res;
    }
    public static String printName(String name){
        return name;
    }
    public static void printName1(String name){
        System.out.println(name);
    }

    public static String PrintNames(String name, String name1, String name2){
        String res = name + name1 + name2;
        return res;
    }

    public static double add(int a, double b, double c, int d){
        double add = a+b+c;
        return add + d;
    }

    public static void add(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args) {
        int res = showDisplay(5,5);
        System.out.println(res);

        Functionclass ob = new Functionclass();
        int res1 = ob.add(3,5);
        System.out.println(res1);

        int res2 = add(2,3,4);
        System.out.println(res2);

        add(2,5,6,7);

        String name = printName("Gungun");
        System.out.println(name);
        printName1("Prerna");

        String res4 = PrintNames("Gungun ", "Prerna ", "Bhumi ");

        System.out.println(res4);

        double res22 = add(2,3,7.0,10);
        System.out.println(res22);

    }
}
