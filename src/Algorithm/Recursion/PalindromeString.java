package Algorithm.Recursion;

public class PalindromeString {
    public static boolean palindrome(int l, String str){
        if(l>= str.length()/2) return true;
        if(str.charAt(l) != str.charAt(str.length()-1-l)) return false;
        return palindrome(l+1, str);
    }
    public static void main(String[] args) {
        String str = "MADAM";
        boolean result = palindrome(0, str);
        System.out.println(result);

    }
}
