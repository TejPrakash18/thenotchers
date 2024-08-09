package Leetcode.LinkedList;

class MLL{
    int data;
    MLL next;

    public MLL(int data){
        this.data=data;
    }

    public static MLL middle(MLL head){
        MLL slow = head;
        MLL fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
public class MiddleOfLL {
    public static void main(String[] args) {
        MLL n1 = new MLL(1);
        MLL n2 = new MLL(2);
        MLL n3 = new MLL(3);
        MLL n4 = new MLL(4);
        MLL n5 = new MLL(5);
        MLL n6 = new MLL(6);

        MLL head = n1;
        n1.next = n2;
        n2.next= n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        MLL ans = MLL.middle(head);
        System.out.println(ans.data);


    }
}
