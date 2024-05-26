package DesignPattern.Singleton;

import java.lang.reflect.Constructor;


class Singleton {
    private static Singleton instance;

    private Singleton() {

        //don't break the singleton by using this methode
        if (instance != null) {
            throw new RuntimeException("you are trying to break singleton design pattern");
        }
    }

    public static Singleton getInstance() {

//        if (instance == null) {
//                instance = new Singleton();
//            }
//            return instance;

        //thread safe object creation;
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

    }
}

public class SingletonPattern {
//    public static void main(String[] args) {
////        Singleton obj = Singleton.getInstance();
////        System.out.println(obj.hashCode());
////
////        Singleton obj2 = Singleton.getInstance();
////        System.out.println(obj2.hashCode());
//    }
    public static void main(String[] args) throws RuntimeException , NoSuchMethodException{
        Singleton obj = Singleton.getInstance();
        System.out.println(obj.hashCode());

        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.hashCode());


        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton obj3 = null;
        try {
            obj3 = constructor.newInstance();
        } catch(Exception e) {
            System.out.println(e);

        }
        System.out.println(obj3.hashCode());


    }
}
