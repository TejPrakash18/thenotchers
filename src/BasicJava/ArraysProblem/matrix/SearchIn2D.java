package BasicJava.ArraysProblem.matrix;

public class SearchIn2D {
    public static int search(int[][] mat, int tar){
        int n = mat.length;
        int m = mat[0].length;
        int si=0;
        int ei = (n*m)-1;
        System.out.println("m :" + m);
        while (si<=ei){
            int mid = si+ (ei-si)/2;
            if(tar == mat[mid/m][mid%m]){
                return mid;
            } else if (tar < mat[mid/m][mid%m]) {
                ei = mid-1;
            }
            else {
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 34;
        int index = search(matrix,  target);
        System.out.println(index);
    }
}
