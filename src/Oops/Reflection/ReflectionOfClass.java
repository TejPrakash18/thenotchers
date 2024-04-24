package Oops.Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class MyClass {
    private String privateField;
    public int publicField;

    public MyClass() {
    }

    public MyClass(String privateField, int publicField) {
        this.privateField = privateField;
        this.publicField = publicField;
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }
}




public class ReflectionOfClass {
    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;

        System.out.println("Class Name: " + clazz.getName());
        System.out.println("Modifiers: " + Modifier.toString(clazz.getModifiers()));
        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        System.out.println("Constructors:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor Name: " + constructor.getName());
            System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("Parameter Type: " + parameterType.getName());
            }
        }

        System.out.println("Fields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType().getName());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
        }

        System.out.println("Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getName());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("Parameter Type: " + parameterType.getName());
            }
        }

    }
}
