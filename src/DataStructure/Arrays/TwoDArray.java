package DataStructure.Arrays;

public class TwoDArray {
    public static void printArray(int [][] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = 0;j<arr[0].length; j++) {
                System.out.print(" Value "+arr[i][j]+" "+("index "+ (2*i+j))+" ("+i+""+","+j+")");
            }
            System.out.println(" ");
        }
    }

    public static void rowPrint(int [][] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = 0;j<arr[0].length; j++) {
                System.out.print(" Value "+arr[i][j]+" "+("index "+ (2*i+j))+" ("+i+""+","+j+")");
//                System.out.print(" Value "+ arr[i][j]);

            }
            System.out.println(" ");
        }
    }
    public static void colPrint(int [][] arr){
        for(int i=0; i<arr.length; i++) {
            for (int j = 0;j<arr[0].length; j++) {
                System.out.print(" Value "+arr[j][i]+" "+("index "+ (2*i+j))+" ("+i+""+","+j+")");
//                System.out.print(" Value "+ arr[j][i]);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {

        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(arr.length-1);
        System.out.println(arr[0].length-1);
        System.out.println();
        printArray(arr);
        System.out.println();
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


        System.out.println();
        rowPrint(arr);
        System.out.println();
        colPrint(arr);


    }
}
