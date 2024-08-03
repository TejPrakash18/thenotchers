package Leetcode.StackProblem;

class StackTwo{
    static int[] arr;
    static int size;
    static int top1;
    static int top2;

    StackTwo(int size){
        this.size =  size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }
    public static void pushOne(int data){
        if(top2- top1==1){
            System.out.println("Stack overflow :) ");
        }
        else{
            top1++;
            arr[top1] = data;
        }
    }
    public static void pushTwo(int data){
        if(top2- top1==1){
            System.out.println("Stack overflow :) ");
        }
        else{
            top2--;
            arr[top2] = data;
        }
    }

    public static void popOne(){
        if(top1 == -1){
            System.out.println("Stack underFlow :) ");
        }
        else{
//            int temp = arr[top1];
//            System.out.println(temp);
            arr[top1] =0;
            top1--;
        }
    }

    public static void popTwo(){
        if(top2 == size){
            System.out.println("Stack underFlow :) ");
        }
        else{
//            int temp = arr[top2];
//            System.out.println(temp);
            arr[top2] =0;
            top2++;
        }
    }
    public static void print() {
        System.out.println();
        System.out.println("Top1: "+ top1);
        System.out.println("Top2: "+ top2);
        for(int i=0; i<size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}

public class TwoArrayStack {
    public static void main(String[] args) {

        StackTwo st = new StackTwo(10);
        st.pushOne(10);
        st.print();
        st.pushOne(20);
        st.print();
        st.pushOne(30);
        st.print();
        st.pushOne(40);
        st.print();
        st.pushOne(50);
        st.print();
        st.pushTwo(100);
        st.print();
        st.pushTwo(90);
        st.print();
        st.pushTwo(80);
        st.print();
        st.pushTwo(70);
        st.print();
        st.pushTwo(60);
        st.print();


        st.popOne();
        st.print();
        st.popOne();
        st.print();

        st.popOne();
        st.print();

        st.popOne();
        st.print();

        st.popOne();
        st.print();

        st.pushTwo(1000);
        st.print();

        st.popOne();
        st.print();
        st.popTwo();
        st.print();

    }
}
