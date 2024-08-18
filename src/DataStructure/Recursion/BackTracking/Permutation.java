package DataStructure.Recursion.BackTracking;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        int i=0;
        printPermutation(str.toCharArray(),i);
    }

    private static void printPermutation(char[] str, int i) {
        if(i >= str.length){
            System.out.println(new String (str)+" ");
            return;

        }
        for (int j = i; j < str.length; j++) {

            swap(str, j, i);
            printPermutation(str,i+1);
            swap(str,i,j); //backtracking

        }

    }

    private static void swap(char[] arr ,int i ,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
