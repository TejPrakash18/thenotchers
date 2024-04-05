package BasicJava.Function;


public class MethodOverloading {
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a, int b , int c){
        return  a+b+c;
    }
    public static void main(String[] args) {
       int addTwo = add(4,5);
       int addThree = add(3, 5, 6);
        System.out.println(addTwo);
        System.out.println(addThree);
    }
}
