package DataStructure.LinkedList;


class NodeLL{
    int data;
    NodeLL next;

    public NodeLL(int data){
        this.data = data;
    }

    public static NodeLL reverse(NodeLL head){
        NodeLL curr = head, prev = null;

        while(curr!=null){
            NodeLL temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr= temp;

        }
        return prev;
    }

    public static void printLL(NodeLL head){
        NodeLL curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr =curr.next;
        }
        System.out.println("null");
    }
}

public class ReversePrintLL {
    public static void main(String[] args) {

        NodeLL nLL = new NodeLL(10);
        nLL.next = new NodeLL(20);
        nLL.next.next = new NodeLL(30);
        nLL.next.next.next = new NodeLL(40);
        NodeLL head = nLL;

        NodeLL.printLL(head);
        NodeLL newHead = NodeLL.reverse(head);
        NodeLL.printLL(newHead);
    }
}
