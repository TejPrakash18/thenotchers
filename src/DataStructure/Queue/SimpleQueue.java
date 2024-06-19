package DataStructure.Queue;


class Queue{
    int size =10;
    int[] queue = new int[size];
    int front, rear;

    Queue(){
        front = -1;
        rear = -1;
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
}
public class SimpleQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(12);

    }
}
