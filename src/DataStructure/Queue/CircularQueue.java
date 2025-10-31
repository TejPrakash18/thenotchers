package DataStructure.Queue;

class CircularQ{
    int[] arr;
    int cap = 4;
    int f, r;
    int currSize;

    CircularQ(){
        arr = new int[cap];
        f = 0;
        r =-1;
        currSize =0;
    }

    public void push(int data){
        if(currSize == cap){
            System.out.println("Queue is full");
            return;
        }
        r = (r+1)%cap;
        arr[r] = data;
        currSize++;
    }
    public void pop(){
        if(currSize ==0){
            System.out.println("Circular Queue is empty");
            return;
        }
        f = (f+1)%cap;
        currSize--;
    }

    public int front(){
        return arr[f];
    }

    boolean empty(){
        return currSize ==0;
    }
    void print(){
        for (int i = 0; i < cap; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        CircularQ circularQ = new CircularQ();
        circularQ.push(1);
        circularQ.push(2);
        circularQ.push(3);
        circularQ.push(4);
        circularQ.pop();
        circularQ.pop();
        circularQ.push(5);
        circularQ.push(8);
//        circularQ.print();
        while (!circularQ.empty()){
            System.out.print(circularQ.front()+" ");
            circularQ.pop();
        }

    }
}
