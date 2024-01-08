package Oops.constructor;

public class ConstructorJava {
    public static void main(String[] args) {
        Human objHuman = new Human("tej", 22);
        objHuman.print();
        System.out.println(Human.id); // static keyword called by class name

    }
}

class Human{
    static int id = 1001; // static keyword are constant veriable
    String name;
    int age;

    public Human(){
        System.out.println("Hy, I'm constractor, \nby calling parameterized constractor");
    }
    public Human(String name, int age){
        this(); // calling current constractor
        this.name = name;
        this.age= age;
    }
    void print(){
        System.out.println("Human name = "+ name);
        System.out.println("Human age = "+ age);
    }
}
