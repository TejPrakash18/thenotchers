package Oops.Reflection;

import java.lang.reflect.Modifier;

 class Human{
    private String name;
    public int age;
}
public class Example {
    public static void main(String[] args) {
        Class<?> obj = Human.class;
        System.out.println("Class name is "+ obj.getName());
        System.out.println("Modifiers: " + Modifier.toString(obj.getModifiers()));
    }
}
