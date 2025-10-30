package DataStructure.LinkedList;


class DoubleNode{
    int val;
    DoubleNode prev;
    DoubleNode next;

    DoubleNode(int val){
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class DOperation{
    DoubleNode head;
    DoubleNode tail;
     DOperation(){
         head = tail = null;
     }
     public void pushOnFront(int val){
         DoubleNode node = new DoubleNode(val);
         if(head == null){
             head=tail = node;
         }else{
             node.next = head;
             head.prev = node;
             head = node;
         }
     }
     public void pushOnBack(int val){
         DoubleNode node = new DoubleNode(val);
         if(head ==null){
             head = tail= node;
         }else {

             node.prev = tail;
             tail.next = node;
             tail = node;
         }
     }
    public void printDLL(){
        DoubleNode curr = head;
        while(curr!=null){
            System.out.print(curr.val+" ->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
public class DoubleLinkedList {
    public static void main(String[] args) {

        DOperation create = new DOperation();
        create.pushOnFront(5);
        create.pushOnFront(7);
        create.pushOnFront(11);

        create.pushOnBack(3);
        create.pushOnBack(1);
        create.pushOnBack(2);

        create.printDLL();

    }
}
