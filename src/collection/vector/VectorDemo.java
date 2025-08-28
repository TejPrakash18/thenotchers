package collection.vector;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add(1, "X"); // insert at index 1

        System.out.println("Vector: " + vector);
        System.out.println("Element at 2: " + vector.get(2));

        vector.remove("B");
        System.out.println("After removal: " + vector);
    }
}
