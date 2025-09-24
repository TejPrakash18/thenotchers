package Oops.Inheritence;


class Parent{
    void greet(){
        System.out.println("Hello, i'm parent class!");
    }
}
class Child extends Parent{

    @Override
    void greet() {
        super.greet();
        System.out.println("Hello from Child");
    }
}
public class SuparKeywordExample {
    public static void main(String[] args) {
       Child obj = new Child();
       obj.greet();
       Parent objP  = new Parent();
       objP.greet();

    }
}
