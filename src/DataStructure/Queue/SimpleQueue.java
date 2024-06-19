package DataStructure.Queue;


class Queue{
    int size =5;
    int[] queue = new int[size];
    int front, rear;

    Queue(){
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        if(rear == size -1){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        else {
            return false;
        }
    }
    public void enQueue(int data){
        if(rear == size-1)
            System.out.println("Queue is full");
        else{
            if(front == -1){
                front =0;
            }
                rear++;
                queue[rear] = data;
                System.out.println("insert data "+ data);
        }
    }
    public int deQueue() {
        int data = queue[front];
        if (front >= rear) {
            front = -1;
            rear = -1;
        } else
            front++;
        return (data);
    }
}
public class SimpleQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);
        queue.enQueue(15);
        boolean empty = queue.isEmpty();
        System.out.println(empty);
        queue.enQueue(16);
        queue.enQueue(17);
        boolean full = queue.isFull();
        System.out.println(full);

        int element = queue.deQueue();
        System.out.println("Deleted element "+element);

        queue.enQueue(17);

    }
}
