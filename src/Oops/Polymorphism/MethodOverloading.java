package Oops.Polymorphism;

class Overloading{
    void sound() {
        System.out.println("Animal make a sound..!");
    }
}
class Dog extends Overloading{
    void sound(){
        System.out.println("Dog is Barks");
    }
}
class Cat extends Overloading{
    void sound(){
        System.out.println("Cat is meows");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.sound();
        Overloading obj1 = new Dog();
        obj1.sound();
        Overloading obj2= new Cat();
        obj2.sound();


    }
}
