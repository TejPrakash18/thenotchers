package Oops.Inheritence.Excercise3;

class Base {
    int x=10;
    void display(){
        System.out.println("Base class");
    }
}
class Derived extends Base{
    int x = 20;
    void display(){
        System.out.println("Derived class");
    }
}
public class Question1 {
    public static void main(String[] args) {

        Base b = new Base();
        Derived d = new Derived();
        Base bd = new Derived();
        System.out.println(b.x);
        System.out.println(d.x);
        System.out.println(bd.x);
        b.display();
        d.display();
        bd.display();

    }
}
