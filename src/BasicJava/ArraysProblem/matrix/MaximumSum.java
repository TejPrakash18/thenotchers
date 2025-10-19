package BasicJava.ArraysProblem.matrix;

import com.sun.security.jgss.GSSUtil;

public class MaximumSum {

    public static int diagonalSum(int mat[][]){
        int sum = 0;
        int length = mat.length;
        for (int i = 0; i < mat.length; i++) {
            sum+=mat[i][i];
            if(i!=length-i-1){
                sum+=mat[i][length-i-1];
            }
        }
        return sum;
    }
    public static int maxSum(int mat[][]){
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int sumOfRow = 0;
            for(int j=0; j<mat[0].length; j++){
                sumOfRow+=mat[i][j];
            }
            maxi = Integer.max(maxi, sumOfRow);
        }
     return maxi;
    }

    public static int maxSumOfCol(int mat[][]){
        int maxi = Integer.MIN_VALUE;

        for (int i=0; i<mat.length; i++){
            int sumOfCol = 0;
            for (int j=0; j<mat[0].length; j++){
                sumOfCol+=mat[j][i];
            }
            maxi = Integer.max(maxi, sumOfCol);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,32},{14,15,16},{7,8,9}};
        int[][] ds = {{1,2,3},{4,5,6},{7,8,9}};

        int ans = maxSum(mat);
        System.out.println(ans);

        int answer = maxSumOfCol(mat);
        System.out.println(answer);

        int answerDs = diagonalSum(ds);
        System.out.println(answerDs);
    }
}
