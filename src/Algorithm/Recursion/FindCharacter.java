package Algorithm.Recursion;

public class FindCharacter {
    public static boolean character1(String str, int i, char key, int size) {
        if (i >= size) return false;

        if (str.charAt(i) == key) {
            return true;
        }
        return character1(str, i + 1, key, size);
    }
    public static int character(String str, int i, char key, int size){
        if(i>=size) return -1;

        if(str.charAt(i)==key) {
            return i;
        }
        return character(str, i+1, key, size);
    }
    public static void main(String[] args) {
//        System.out.println(0647);
//        System.out.println(8421);
        String str = "neha";
        int i=0;
        char key = 't';
        int size = str.length();

        int ans = character(str,i,key,size);
        System.out.println(ans);

        boolean ans1 = character1(str,i,key,size);
        System.out.println(ans1);

    }
}
