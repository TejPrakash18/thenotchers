package DesignPattern.prototype.deepcopy;

public class Person implements Cloneable{
        String name;
        Address address;

        public Person(String name, Address address){
            this.name = name;
            this.address = address;
        }

        public Person clone(){
            return new Person(this.name, new Address(this.address));
        }

}
