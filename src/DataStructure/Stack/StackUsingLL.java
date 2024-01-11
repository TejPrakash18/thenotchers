package DataStructure.Stack;

import java.sql.SQLOutput;

class Node{

    int data;
    Node link;

    Node(int data){
        this.data= data;
        this.link= null;
    }
}
class Stack{
    public static Node head;
    public static boolean isEmpty(){
        return head == null;
    }

    public void pushElement(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            System.out.println(head.data+" Pushed");
        }else {
            newNode.link = head;
            head = newNode;
            System.out.println(head.data+" Pushed");
        }
    }
    public void popElement(){
        if(head== null){
            System.out.println("Stack is empty");
        }
        else {
            int res = head.data;
            head = head.link;
            System.out.println(res+"Poped Element");
        }
    }

    boolean isEmptyOrNot(){
        return head == null;
    }

    int peekElement(){
        if(head == null){
            return -1;
        }
        else{
            return head.data;
        }
    }

    public void display(){
        Node current = head;
        while (current!= null){
            System.out.print(current.data+" -> ");
            current = current.link;
        }
        System.out.println("null");
    }
}


public class StackUsingLL {
    public static void main(String[] args) {
        Stack buildStack = new Stack();

        boolean empty = Stack.isEmpty();
        System.out.println(empty);
        buildStack.pushElement(2);
        buildStack.pushElement(8);
        buildStack.pushElement(9);

        buildStack.display();

        buildStack.popElement();
        buildStack.display();

        boolean res = buildStack.isEmptyOrNot();
        System.out.println(res);

       int resPeekElement =  buildStack.peekElement();
        System.out.println(resPeekElement);

    }
}
