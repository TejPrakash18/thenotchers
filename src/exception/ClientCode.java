package exception;

public class ClientCode {
    public static void main(String[] args) throws InvalidAgeException {
        int age = 15;
        try{
            if (age < 8){
                throw new InvalidAgeException("You can not vote!");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
