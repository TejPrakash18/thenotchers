package Leetcode.Strings;

public class IsSubsequences {
    static boolean isSebsequence(String s, String t){
        int sp = 0;
        int tp = 0;
        int sl = s.length();
        int tl = t.length();
        while (sp<sl && tp<tl){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++; tp++;
            }
            else {
                tp++;
            }
        }
        return sp == sl;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean ans = isSebsequence(s,t);
        System.out.println(ans);
    }
}
