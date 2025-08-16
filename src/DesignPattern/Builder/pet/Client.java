package DesignPattern.Builder.pet;

public class Client {
    public static void main(String[] args) {
        Pet dog = new Pet.PetBuilder()
                .setName("Tommy")
                .setType("Dog")
                .setAge(1)
                .setColor("Brown")
                .setVaccinated(true)
                .setWeight(20)
                .build();
        System.out.println(dog);
    }
}
