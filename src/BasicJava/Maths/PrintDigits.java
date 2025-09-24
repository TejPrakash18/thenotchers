package BasicJava.Maths;

public class PrintDigits {
    public static void printDigits(int number){
        while(number!=0){
            int digit = number%10;
            number = number/10;
            System.out.println("Digit " + digit);
        }
    }

    public static void sumOfDigit(int number){
        int sum=0;
        while(number!=0){
           sum+=number%10;
            number = number/10;
        }
        System.out.println("sum of digit "+ sum);
    }

    public static void countOfDigit(int number){
        int count =0;
        while(number!=0){
            int  digit  = number % 10;
            count++;
            number = number/10;
        }
        System.out.println("count of Digit "+ count);

    }

    public static  void reverseDigit(int number){
        int rev =0;
         while(number!=0){
             int digit = number%10;
             rev = (rev*10)+digit;
             number = number/10;
         }
        System.out.println("reverse number "+ rev);
    }
    public static void main(String[] args) {
        printDigits(778);
        sumOfDigit(779);
        countOfDigit(6679);
        reverseDigit(5147);
    }
}
