package BasicJava;

public class Test {
    public static void main(String[] args) {
//        int arr[] = {1,2,3};
//        System.out.println(arr);

        char str[] = {'a','b', 'c'};
//        char str1[] = "abc".toCharArray();
//        System.out.println(str1);
        System.out.println(str);


        String java = "Java";
        char[] ch = java.toCharArray();
        int si = 0;
        int en = ch.length-1;

        while(si<en){
            char temp = ch[si];
            ch[si] = ch[en];
            ch[en] = temp;
            si++;
            en--;
        }

        System.out.println(ch);

    }
}
