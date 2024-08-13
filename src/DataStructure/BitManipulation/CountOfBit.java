package DataStructure.BitManipulation;

public class CountOfBit {
    public static int countNumberOfBits(int n){
        int cnt =0;
        while(n!=0){
          if((n&1)==1){
           cnt++;
          }
            n = n>>1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 11;
        int ans = countNumberOfBits(n);
        System.out.println(ans);
    }
}
