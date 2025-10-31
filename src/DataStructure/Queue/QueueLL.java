package DataStructure.Queue;


class Qll{
    int val;
    Qll next;

    Qll(int val){
        this.val = val;
    }
}

class QueueImp{
    Qll head;
    Qll tail;

    QueueImp(){
        head = tail = null;
    }

    public void push(int val){
        Qll newNode = new Qll(val);
        if(empty()){
            head =tail = newNode;
        }
        else {
            tail.next = newNode;
            tail= newNode;
        }
    }
    public void pop(){
        if(empty()){
            System.out.println("queue is empty!");
        }else{
            Qll temp = head;
            head = head.next;
            temp = null;
        }
    }
    public int front(){
        if(empty()){
            System.out.println("Queue is empty");
        }
        return head.val;
    }

    boolean empty(){
        return head == null;
    }
}
public class QueueLL {
    public static void main(String[] args) {
        QueueImp queue = new QueueImp();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.front());

        while (!queue.empty()){
            System.out.print(queue.front()+" ");
            queue.pop();
        }
    }
}
