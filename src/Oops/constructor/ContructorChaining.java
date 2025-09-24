package Oops.constructor;

class Chaining{
    Chaining(){
        this("Tej");
        System.out.println("Hello i am called another constructor");
    }
    Chaining(String name){
        this("Tej", 23);
        System.out.println("Hello " + name);

    }
    Chaining(String name, int age){
        System.out.println("Hello " + name +" this is my age " + age);
    }
}
public class ContructorChaining {
    public static void main(String[] args) {
        Chaining chaining = new Chaining();
    }
}
