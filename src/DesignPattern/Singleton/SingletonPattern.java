package DesignPattern.Singleton;
class Singleton{
    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void printSingleton(){
        System.out.println("heyy Singleton... :)");
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.printSingleton();
    }
}
