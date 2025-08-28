package collection.iterators;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.print("Original "+list.toString());
        ListIterator<String> lit = list.listIterator();

        System.out.println();

        // Forward traversal
        while (lit.hasNext()) {
            String fruit = lit.next();
            if (fruit.equals("Banana")) {
                lit.set("Orange"); // Replace Banana with Orange
            }
        }

        // Backward traversal
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        System.out.println(list); // [Apple, Orange, Mango]
    }
}
