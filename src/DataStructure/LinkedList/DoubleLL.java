package DataStructure.LinkedList;

class DLL{
    int data;
    DLL next;
    DLL prev;

    public DLL(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public static void printDLL (DLL head) {
        DLL temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int getLength(DLL head){
        int len=0;
        DLL temp = head;
        while (temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}
public class DoubleLL {
    public static void main(String[] args) {

        DLL first = new DLL(10);
        DLL second = new DLL(20);
        DLL third = new DLL(30);
        DLL fourth = new DLL(40);

        DLL head = first;

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        DLL.printDLL(head);
        int ans = DLL.getLength(head);
        System.out.println("lenght of DLL " +ans);
    }
}
