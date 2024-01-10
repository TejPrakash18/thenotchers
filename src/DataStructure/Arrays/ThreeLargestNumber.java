package DataStructure.Arrays;



class Printlargest{
    public void print3Largest(int size, int arr[]){
        int first , sec , third;

        if(size < 3){
            System.out.println("Invalid Input");
            return;
        }
        first =  sec = third = Integer.MIN_VALUE;

        for (int i=0; i <size ; i++){
            if( arr[i] > first){
                third = sec;
                sec = first;
                first = arr[i];
            } else if (arr[i] > sec) {
                    third = sec;
                sec = arr[i];
            }
            else if(arr[i] > third){
                third = arr[i];
            }

        }
        System.out.println("three largest numbers => " + first +" "+ sec + " "+ third);
    }
}
public class ThreeLargestNumber {
    public static void main(String[] args) {

        int arr[] = {12,13,1,10,34,1};
        int arr1[] = {10,4,3,50,23,90};
        int size = arr.length;
        int size1 =  arr1.length;
        Printlargest print = new Printlargest();

        print.print3Largest(size, arr);
        print.print3Largest(size1, arr1);




    }
}
