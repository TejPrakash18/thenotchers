package DataStructure.Strings;

import BasicJava.HelloWorld;

public class BufferString {
    public static void main(String[] args) {
        String name = new String("Hello, I am String");
//        name = "hey";
        System.out.println(name);
////        String name1 = new String("Hello i am new String");
////        System.out.println(name1);
//////        System.out.println(name + name1);
////
////        for (int i=0; i<name.length(); i++)
////        {
////            System.out.println(name.charAt(i)+" "+i);
////        }
//        String sub = name.substring(1,8);
//        System.out.println(sub);


        StringBuffer str = new StringBuffer("Hey, I am java");
//        str = "hey";
        System.out.println(str);
        String n= str.substring(1,8);
        System.out.println(n);

        String name2 = new String("           Hey, I am java   ");
        String name3 = new String("Hey, I am java");
        int comparison = name3.compareTo(name2);

        System.out.println(comparison);
        boolean isEqual = name2.equals(name3);
        System.out.println(isEqual);

        int index = str.indexOf("e");
        System.out.println(index);

        //String modification

        System.out.println("to uppar case "+name2.toUpperCase());
        System.out.println("trim String "+name2.trim());

        System.out.println(String.format("HelloWorld %15.8f" ,47.6789));
        System.out.println(String.format("%s",47.98));


//        char charArray[] = new char[3];
//        charArray[0] = 'a';

    }
}
