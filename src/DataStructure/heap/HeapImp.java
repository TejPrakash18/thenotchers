package DataStructure.heap;

class Heap{
    int[] heap;
    int capacity;
    int size;

    public Heap(int capacity){
        this.capacity =capacity;
        heap = new int[capacity+1];
        size=0;
    }
    public void insert(int value){
        if(size >= capacity){
            System.out.println("Heap is full");
            return;
        }
        heap[++size]= value;
        int i= size;

        while (i > 1 && heap[i/2] < heap[i]){
            swap(i, i/2);
            i=i/2;
        }
    }

    public void deleteNode(){
        if(size==0){
            return;
        }
        heap[1] = heap[size];
        size--;

        int i=1;
        while(i<size){
            int leftChild = 2*i;
            int rightChild = 2*i+1;

            if(leftChild < size && heap[i] < heap[leftChild]){
                swap(i, leftChild);
                i = leftChild;
            }
            else if(rightChild < size && heap[i] < heap[rightChild]){
                swap(i,rightChild);
                i=rightChild;
            }
            else {
                return;
            }
        }
    }

    public void sizeHeap(){
        System.out.println(size);
    }
    public void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
    public void printHeap(){
        for (int i = 1; i <=size ; i++) {
            System.out.print(heap[i]+" ");
        }
    }
    public void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChild = 2 * i;
        int rightChild = 2 * i + 1;


        if (leftChild <= n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if (rightChild <= n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest); // recursive call
        }
    }


}
public class HeapImp {
    public static void main(String[] args) {
        Heap heap = new Heap(5);
        heap.insert(50);
        heap.insert(55);
        heap.insert(53);
        heap.insert(52);
        heap.insert(54);



        heap.printHeap();
//        System.out.println();
//        heap.sizeHeap();
        heap.deleteNode();
        System.out.println();
        heap.printHeap();

        int h[] = {-1, 54,53, 55, 52, 50};

        int n = h.length;
        System.out.println(n);
        for (int i = (n - 1) / 2; i > 0; i--) {
            heap.heapify(h, n - 1, i);
        }

        System.out.println();
        System.out.println("Heapify");
        for (int i = 1; i <n ; i++) {
            System.out.print(h[i]+" ");
        }

    }
}
