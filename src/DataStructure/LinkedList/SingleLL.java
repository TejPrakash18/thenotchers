package DataStructure.LinkedList;

class LLNode{
    int data;
    LLNode next;

    LLNode(int data,LLNode next){
        this.data = data;
        this.next = next;
    }
}
public class SingleLL {
    public static void main(String[] args) {
        LLNode node1 = new LLNode(12, null);
        LLNode node2 = new LLNode(13, null);
        LLNode node3 = new LLNode(14, null);
        LLNode node4 = new LLNode(15, null);
        LLNode node5 = new LLNode(16, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LLNode current = node1;
        int length = 0;
        while (current != null){
            length++;
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println("length of LL "+length);

    }
}
