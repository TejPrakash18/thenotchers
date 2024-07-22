package DataStructure.BitManipulation;

public class Convert2Decimal {
    public static int decimal(String x){
        int len = x.length();
        int position =1;
        int res =0;
        for(int i=len-1; i>=0; i--){
            if (x.charAt(i)=='1'){
                res = res+position;
            }
            position = position*2;
        }

        return res;
    }
    public static void main(String[] args) {

        String binary = "111";
        int ans = decimal(binary);
        System.out.println(ans);
    }
}
