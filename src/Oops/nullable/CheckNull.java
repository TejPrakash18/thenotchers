package Oops.nullable;

import java.util.Optional;

public class CheckNull {
    public static void main(String[] args) {
        String[]  words = new String[10];

        Optional<String> checkNUll = Optional.ofNullable(words[5]);

        if (checkNUll.isPresent()){
            System.out.println(words);
        }
        System.out.println("Words is null");
    }
}
