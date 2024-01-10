package DataStructure.Stack;

class ArrayOfStack{
    int top= -1;
    int size = 5;
    int stack[] = new int[size];

    boolean pushElement(int data){
        if(top >= (size-1)){
            System.out.println("Stack is full");
            return false;
        }
        else {
            stack[++top] = data;
            System.out.println(data +" pushed :)");
            return true;
        }
    }

    int popElement(){
        if(top < 0){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            int data = stack[top--];
            System.out.println(data + " poped item :) ");
            return 0;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = stack[top];
            return x;
        }
    }

    void printStack() {
        for(int i= top;  i>-1; i--){
            System.out.println(stack[i]);
        }
       System.out.println();
   }

}




public class StackOfArray {
    public static void main(String[] args) {

        ArrayOfStack stackObject = new ArrayOfStack();
        stackObject.pushElement(1);
        stackObject.pushElement(2);
        stackObject.pushElement(3);
        stackObject.pushElement(4);
        stackObject.pushElement(5);
        stackObject.pushElement(6);
        System.out.println();
        stackObject.printStack();

        System.out.println("Peek Element "+ stackObject.peek());



        stackObject.popElement();
        stackObject.popElement();
        stackObject.popElement();
        System.out.println("Peek Element "+ stackObject.peek());
        stackObject.popElement();
        stackObject.popElement();
        stackObject.popElement();








    }
}
