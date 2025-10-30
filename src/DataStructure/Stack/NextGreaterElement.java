package DataStructure.Stack;

import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterElement {
    public static void main(String[] args) {
        Stack s = new Stack();
        ArrayList<Integer> list = new ArrayList<>();

        int[] arr = {6, 8, 0, 1, 3};

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!Stack.isEmpty() && s.peekElement() <= arr[i]) {
                s.popElement();
            }
            if (Stack.isEmpty()) {
                list.add(-1);
            } else {
                list.add(s.peekElement());
            }
            s.pushElement(arr[i]);
        }
        Collections.reverse(list);

        System.out.println(list);
    }
}
