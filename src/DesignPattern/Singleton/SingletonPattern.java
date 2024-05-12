package DesignPattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton {
    private static Singleton instance;

    private Singleton() {

        if (instance != null) {
            throw new RuntimeException("you are trying to break singleton design pattern");
        }
    }

    public static Singleton getInstance() {


        //thread safe object creation;
        synchronized (SingletonPattern.class) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

    }
}

public class SingletonPattern {
    public static void main(String[] args) throws NoSuchMethodException {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj.hashCode());

        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.hashCode());


        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton obj3 = null;
        try {
            obj3 = constructor.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println(obj3.hashCode());


    }
}
