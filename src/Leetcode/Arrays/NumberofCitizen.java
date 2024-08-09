package Leetcode.Arrays;

public class NumberofCitizen {
    public static int countSeniors(String[] details) {
        int cnt = 0;

        for (int i = 0; i < details.length; i++) {
            String str = details[i];

            int digitOne = str.charAt(11) - '0';
            int digitTwo = str.charAt(12) - '0';


            if ((digitOne * 10) + digitTwo > 60) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        String [] arr = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ans = countSeniors(arr);
        System.out.println(ans);
    }
}
