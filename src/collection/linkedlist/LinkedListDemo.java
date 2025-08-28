package collection.linkedlist;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Grapes"); // add at beginning
        fruits.addLast("Orange");  // add at end

        System.out.println("Fruits List: " + fruits);

        // Accessing elements
        System.out.println("First Fruit: " + fruits.getFirst());
        System.out.println("Last Fruit: " + fruits.getLast());

        // Removing elements
        fruits.remove("Banana");
        fruits.removeFirst();
        System.out.println("After removal: " + fruits);

        // Queue operations
        fruits.offer("Pineapple"); // add like queue
        System.out.println("Peek: " + fruits.peek()); // see first element
        System.out.println("Poll: " + fruits.poll()); // remove first element
        System.out.println("Final List: " + fruits);
    }
}
