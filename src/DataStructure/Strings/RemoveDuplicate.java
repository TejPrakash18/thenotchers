package DataStructure.Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static String removeDuplicateCharacters(String str){
        char[]charsOfStr=str.toCharArray();
        Set<String> uniqueCharacters=new HashSet<>();
        for(char character:charsOfStr){
            uniqueCharacters.add(String.valueOf(character));
        }
        return String.join("",uniqueCharacters);
    }

    public static void main(String[] args) {
         String str = removeDuplicateCharacters("heeelo");
        System.out.println(str);
    }
}
