package Oops.enums;

enum Season {
    WINTER("Cold"),
    SPRING("Pleasant"),
    SUMMER("Hot"),
    AUTUMN("Cool");

    private String description;

    // Constructor
    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Season s = Season.WINTER;
        System.out.println(s);                  // WINTER
        System.out.println(s.getDescription()); // Cold

        // Loop through all enums
        for (Season season : Season.values()) {
            System.out.println(season + " : " + season.getDescription());
        }
    }
}
