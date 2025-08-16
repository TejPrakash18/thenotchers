package DesignPattern.prototype.deepcopy;

public class Address {
    String city;

    Address(String city){
        this.city = city;
    }

    Address(Address other){
        this.city = other.city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + city + '\'' +
                '}';
    }
}
