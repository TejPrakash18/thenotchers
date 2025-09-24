package Oops.Interface.functionalinterface;

class PersonCreate {
    String name;
    PersonCreate(String name){
        this.name = name;
        System.out.println("Created Person " + name);
    }
}

@FunctionalInterface
interface PersonFactory{
    PersonCreate create(String name);
}

public class Person {
    public static void main(String[] args) {
        PersonFactory factory = PersonCreate::new;
        factory.create("Tej");
    }
}
