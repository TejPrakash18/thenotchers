package DataStructure.LinkedList;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

    public static void removeElement(int key, ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            if (curr.val == key){
                prev.next = curr.next;
            }

        }
    }

}
public class RemoveElement {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(11);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNode.removeElement(9, node1);
    }
}
