package DataStructure.Arrays;

public class TwoDArray {
//    public static int getinput(int [][] arr){
//
//    }
//int a =10;
    public static void printArray(int [][] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = 0;j<arr.length-1; j++) {
                System.out.print(" Value "+arr[i][j]+" "+("index "+ (2*i+j)));
//                System.out.print();
            }
            System.out.println(" ");
//            System.out.println(a);
        }
    }
    public static void main(String[] args) {
//        int twod[][] = {
//                {1,2},
//                {2,3},
//                {2,3}
//        };
//        for (int i=0; i<3;i++){
//            for (int j=0; j<2; j++){
//                System.out.print(twod[i][j]+" ");
//            }
//            System.out.println();
//        }

        int twod[][] = {
                {1,2},
                {2,3},
                {2,3}
        };
        printArray(twod);
//        System.out.println(res);


    }
}
