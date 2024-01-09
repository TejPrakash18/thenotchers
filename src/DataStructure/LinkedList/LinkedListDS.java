package DataStructure.LinkedList;


class Node{
    int data;

    Node next;

    public Node(int data){
        this.data= data;
        this.next = null;
    }
}
class LinkedList{
    Node head;

    public void addToHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

        public void display(){
        Node current = head;
        while (current!= null){
            System.out.println(current.data+" ");
            current = current.next;
        }
            System.out.println();
        }
}
public class LinkedListDS {
    public static void main(String[] args) {
        LinkedList ll =  new LinkedList();
        ll.addToHead(3);
        ll.addToHead(2);
        ll.addToHead(1);

        ll.display();

        ll.addToTail(4);
        ll.addToTail(5);
        ll.addToTail(6);

        ll.display();
        
        ll.addToHead(7);
        ll.display();
    }
}
