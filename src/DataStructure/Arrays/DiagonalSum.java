package DataStructure.Arrays;

public class DiagonalSum {
    public static int sum(int arr[][]){
       int sum =0;
       for(int i=0; i< arr.length; i++){
           for(int j=0; j<arr[0].length; j++){
               if(i==j){
                   sum+=arr[i][j];
               } else if (i+j == arr.length-1) {
                   sum+=arr[i][j];
               }
           }
       }
       return sum;
    }
    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int result = sum(arr);
        System.out.println(result);
        int result1 = sum(arr1);
        System.out.println(result1);

    }
}
