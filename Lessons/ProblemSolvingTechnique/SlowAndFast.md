### The fast and slow pointer technique, also known as the two-pointer or tortoise and hare algorithm, is a fundamental approach used to solve problems involving linked lists and arrays. This technique is particularly useful for cycle detection, finding the middle of a linked list, and other problems that can be solved by comparing the progress of two pointers moving at different speeds.

#### How It Works
1. `Initialization:`

Initialize two pointers, typically called `slow` and `fast`.

Both pointers start at the same position (usually the head of a linked list or the beginning of an array).
2. `Movement:`

Move the slow pointer one step at a time.

Move the fast pointer two steps at a time.
3. `Meeting Point:`

If there is a cycle, the fast pointer will eventually meet the slow pointer.

If there is no cycle, the fast pointer will reach the end of the data structure first.

```java
//Detecting a Cycle in a Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CycleDetection {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle

        System.out.println(hasCycle(head)); // Output: true
    }
}

```