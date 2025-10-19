package BasicJava;

public class BinaryTDecimal {
    public static void main(String[] args) {
        String binary = "101";
        int num =0; int p =1;

        for (int i = binary.length()-1; i >=0 ; i--) {
            if (binary.charAt(i) == '1'){
                 num = num+p;
            }
            p = p*2;
        }
        System.out.println(num);
    }
}
