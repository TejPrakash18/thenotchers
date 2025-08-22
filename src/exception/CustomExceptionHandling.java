package exception;

public class CustomExceptionHandling {
    static void checkAge(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Must be age 18");
        }else {
            System.out.println("you can vote");
        }
    }

    public static void main(String[] args) {
        try
        {
            checkAge(18);
        } catch (InvalidAgeException e) {
            System.out.println("caught " + e.getMessage());
        }
    }
}
