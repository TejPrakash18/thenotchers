package DesignPattern.prototype.deepcopy;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("Tej", new Address("Iglas"));
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.address.city);
        Person obj = person.clone();
//        System.out.println(person.toString());
    }
}
