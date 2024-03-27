package BasicJava.StringProblems;

public class CharToString {
    public static void main(String[] args) {
        char ch = 'T';
        String str= Character.toString(ch);
        System.out.println("Character to String "+str);
        System.out.println("\n");

        String name = "Tej";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            System.out.println("String to character "+c);
        }

    }
}
