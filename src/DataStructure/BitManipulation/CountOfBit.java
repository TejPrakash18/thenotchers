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
    public static int countSetBit(int n){
        int count=0;
        while (n!=0){
            n = (n & (n-1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 14;
        int ans = countNumberOfBits(n);
        System.out.println(ans);
        int answer = countSetBit(n);
        System.out.println(answer);
    }
}
