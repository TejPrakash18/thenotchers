package DataStructure.Arrays;

class ArrayData{
    int []arr;
    public ArrayData() {
        arr = new int[5]; // Initialization of array with size 5
    }
    public void setData(int data){
        for(int i=0; i<5; i++){
           this.arr[i] = data;
        }
    }

    public void displayArray(){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

public class ArrayCreation {
    public static void main(String[] args) {
        System.out.println("Array creation by object");
        ArrayData obj = new ArrayData();
        obj.setData(2);
        obj.setData(3);
        obj.setData(4);
        obj.setData(5);
        obj.setData(7);
        obj.displayArray();
    }
}
