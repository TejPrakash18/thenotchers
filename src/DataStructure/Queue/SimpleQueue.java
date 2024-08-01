package DataStructure.Queue;


class Queue{
    int size;
    int[] queue;
    int front, rear;

    Queue(int size){
        this.size = size;
        queue=new int[size];
        front = 0;
        rear = 0;
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
        if(front == rear){
            return true;
        }
        else {
            return false;
        }
    }
    public int peek(){
        int peek = queue[front];
        return peek;
    }
    public void enQueue(int data){
        if(rear == size-1)
            System.out.println("Queue is full");
        else{
                rear++;
                queue[rear] = data;
                System.out.println("insert data "+ data);
        }
    }
    public int deQueue() {
        int data = queue[front];
        if (front == rear) {
            front = 0;
            rear = 0;
        } else
            front++;
        return (data);
    }
}
public class SimpleQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);
        queue.enQueue(15);

        int peekElement = queue.peek();
        System.out.println("peek element "+peekElement);
        boolean empty = queue.isEmpty();
        System.out.println("empty or not :) " +empty);
        queue.enQueue(16);
        queue.enQueue(17);
        boolean full = queue.isFull();
        System.out.println("full or not :) "+full);

        int element = queue.deQueue();
        System.out.println("Deleted element "+element);

        queue.enQueue(17);

    }
}
