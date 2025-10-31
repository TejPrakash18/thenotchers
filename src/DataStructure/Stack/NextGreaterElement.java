package DataStructure.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        Stack st = new Stack();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!Stack.isEmpty() && st.peekElement() <= nums2[i]) {
                st.popElement();
            }
            if (Stack.isEmpty()) {
                m.put(nums2[i], -1);
            } else {
                m.put(nums2[i], st.peekElement());
            }
            st.pushElement(nums2[i]);
        }

        int[] list = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            list[i] = m.get(nums1[i]);
        }
        return list;
    }

    public static void main(String[] args) {

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};


//        Stack s = new Stack();
//        ArrayList<Integer> list = new ArrayList<>();

//        int[] arr = {6, 8, 0, 1, 3};
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            while (!Stack.isEmpty() && s.peekElement() <= arr[i]) {
//                s.popElement();
//            }
//            if (Stack.isEmpty()) {
//                list.add(-1);
//            } else {
//                list.add(s.peekElement());
//            }
//            s.pushElement(arr[i]);
//        }
//        Collections.reverse(list);
//
//        System.out.println(list);


       int[] ans =  NextGreaterElement.nextGreaterElement(nums1, nums2);
        for (int an : ans) {
            System.out.print(an+" ");
        }
    }
}
