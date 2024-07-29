package DataStructure.LinkedList;


class Node{
    int data;

    Node next;

    public Node(int data){
        this.data= data;
//        this.next = null;
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

    public void addAtPosition(){

    }

    public void display(){
        Node current = head;
        while (current!= null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteToHead(){
        Node current = head;
        if(current == null){
            System.out.println("Linked list is empty");
        }
        else {
            head = current.next;
        }
    }

    public void deleteToTail(){
        if(head == null || head.next == null){
            System.out.println("empty");
            head = null;
        }
        else {
            Node current = head;
            while (current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }

    }

}
public class LinkedListDS {
    public static void main(String[] args) {
        LinkedList ll =  new LinkedList();

        ll.deleteToHead();
        ll.deleteToTail();

        ll.addToHead(3);
        ll.addToHead(2);
        ll.addToHead(1);
        ll.deleteToHead();

        ll.display();

        ll.deleteToTail();

        ll.display();

        ll.addToTail(4);
        ll.addToTail(5);
        ll.addToTail(6);

        ll.display();

        ll.addToHead(7);
        ll.display();
        ll.deleteToHead();
        ll.addToTail(8);
        ll.display();
    }
}
