package HackerRank.ProblemSolving;

import java.util.Scanner;

public class TheHurdleRace {
    public static int doseJump(int height[], int k){
        int max = height[0];
        for(int i=0; i<height.length; i++){
            if(max < height[i]){
                max =  height[i];
            }
        }
        int ans = max-k;

        return ans;
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int size = scan.nextInt();
        int k = scan.nextInt();

        int height[] = new int[size];

        for(int i=0; i<height.length; i++){
            height[i] = scan.nextInt();
        }

        int result =  doseJump(height, k);

        if(result < 0){
            System.out.println("0");
        }
        else{
            System.out.println(result);
        }

    }
}
