package DataStructure.Arrays;

import java.util.ArrayList;

public class PrimeNumbers {
    static public void prime(int numberStart, int numberEnd){
        ArrayList<Integer> prime = new ArrayList<>();

        for(int i = numberStart; i< numberEnd; i++) {
            boolean isPrime = i != 1;
            for (int j = 2 ; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                prime.add(i);
            }
        }
        for(int element : prime){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        prime(1, 50);
    }
}
