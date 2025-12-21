package DataStructure.slidingwindow;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr= {12,-1,-7,18,-15,9,8,6};
        int k=3;
        int [] newArray =new int[arr.length-k+1];
        for (int i = 0; i < k; i++) {
            if(arr[i] < 0){
                newArray[i] = arr[i];
                
            }
        }
        for (int j = k; j < arr.length; j++) {
            if(arr[j]<0){
                newArray[j] =arr[j];
            }
        }
        for (int m = 0; m < newArray.length ; m++) {
            System.out.println(newArray[m]);
        }
    }
}
