package DataStructure.LinkedList;

class DNode{
    int data;
    DNode next;

    public DNode(int data){
        this.data= data;
        this.next = null;
    }
    public static DNode deleteDuplicate(DNode head){
        DNode curr = head;
         while (curr != null) {
           while (curr.next != null && curr.data == curr.next.data)
             curr.next = curr.next.next;
           curr = curr.next;
         }

         return head;

    }

}
public class RemoveDuplicate {
    public static void main(String[] args) {

        DNode head = new DNode(1);
        DNode second = new DNode(1);
        DNode third = new DNode(1);

        head.next = second;
        second.next = third;

        DNode ans = DNode.deleteDuplicate(head);
        System.out.println(ans.data);
//        System.out.println(ans.next.data);
//        System.out.println(ans.next.next.data);
    }
}
