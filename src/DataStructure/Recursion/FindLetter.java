package DataStructure.Recursion;

import java.util.Scanner;

public class FindLetter {
    static int find(String name, char ch,int i){
        int len = name.length();

        //base case
        if(i>=len) return -1;

        // condition
        if(name.charAt(i)==ch) return i;
        //recursion call
       return find(name, ch, i+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "neha";
        char ch = scan.next().charAt(0);

        int ans = find(name, ch,0);
        System.out.println("value at index " + ans);
    }
}
