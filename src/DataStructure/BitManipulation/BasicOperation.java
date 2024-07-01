package DataStructure.BitManipulation;

public class BasicOperation {
    public static void main(String[] args) {
        int x = 12;
        int y = 10;
        int z = 5;
        System.out.println("Bitwise AND of (" + x + " , " + y + ") is: " + (x & y));
        System.out.println("Bitwise OR of (" + x + " , " + y + ") is: " + (x | y));
        System.out.println("Bitwise XOR of (" + x + " , " + y + ") is: " + (x ^ y));
        System.out.println("Bitwise NOT of " + z + " is: " + ~z);


    }
}
