package BasicJava.LoopsProblems;

public class AddTwoBinary {
    public static String addBinary(String binary1, String binary2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? binary1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? binary2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 2;
            sb.insert(0, sum % 2);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String binary1 = "1010";
        String binary2 = "0011";

        String sum = addBinary(binary1, binary2);
        System.out.println("Sum "+ sum );

    }
}
