package BasicJava.Function;

public class Function {
    final static int num =10;
    public static void display(){
        System.out.println("Hey, I'm function:)");
        System.out.println(num);
    }

    final int number = 20;
    public void show(){
        System.out.println("hey I'm function again:)");
        System.out.println(number);
    }
    public static void main(String[] args) {
        display();
        Function obj = new Function();
        obj.show();
    }
}