package DesignPattern.Builder.pet;

public class Pet {
    private String name;
    private String type;
    private int age;
    private String color;
    private boolean vaccinated;
    private int weight;

    private Pet(PetBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.age = builder.age;
        this.color = builder.color;
        this.vaccinated = builder.vaccinated;
        this.weight = builder.weight;

    }

    public static class PetBuilder {
        private String name;
        private String type;
        private int age;
        private String color;
        private boolean vaccinated;
        private int weight;

        public PetBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PetBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PetBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PetBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PetBuilder setVaccinated(boolean vaccinated) {
            this.vaccinated = vaccinated;
            return this;
        }

        public PetBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Pet build() {
            return new Pet(this);
        }

    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", vaccinated=" + vaccinated +
                ", weight=" + weight +
                '}';
    }
}
