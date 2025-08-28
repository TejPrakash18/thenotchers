package collection.iterators;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String fruit = it.next();
            if (fruit.equals("Banana")) {
                it.remove(); // Safe removal
                System.out.println("by if block : " +fruit);
            }
            System.out.println("by iterator: " +fruit);
        }

        System.out.println(list); // [Apple, Mango]
    }
}
