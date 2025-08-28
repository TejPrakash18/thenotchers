package collection.stack;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top element (peek): " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);

        // Search
        System.out.println("Position of 10: " + stack.search(10));
        System.out.println("Is stack empty? " + stack.empty());
    }
}
