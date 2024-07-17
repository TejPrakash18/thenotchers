package HackerRank.ProblemSolving;

import java.util.HashSet;
import java.util.Scanner;

public class SalesByMatch {
    public static int matchCount(int arr[]){
        int cnt =0;
        HashSet<Integer> st = new HashSet<>();

        for(int element : arr){
            int data = element;
            if(st.contains(data)){
                st.remove(data);
                cnt++;
            }
            else {
                st.add(data);
            }

        }
        return  cnt;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int ans = matchCount(arr);
        System.out.println(ans);
    }
}
