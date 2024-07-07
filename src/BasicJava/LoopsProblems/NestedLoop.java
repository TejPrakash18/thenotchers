package BasicJava.LoopsProblems;

public class NestedLoop {
    public static void main(String[] args) {
        int arr[] ={1,-2,4,-5,1};
        int cnt=0;
        for (int i = 0; i <= 4; i++) {
            int sum=0;
            for (int j = i; j <= 4; j++) {
//                System.out.println(j);
//                System.out.println("\n");
                System.out.println(arr[j]);
                sum = arr[j]+sum;
                if(sum<0){
                    cnt++;
                }
            }
            System.out.println(" ");
        }
        System.out.println(cnt);
    }
}
