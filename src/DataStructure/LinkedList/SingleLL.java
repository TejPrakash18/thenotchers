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
        LLNode node1 =new LLNode(12, null);
        LLNode node2 = new LLNode(13, null);

        LLNode  address = node1.next = node2;


        System.out.println(address.hashCode());

    }
}
