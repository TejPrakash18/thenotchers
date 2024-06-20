package Algorithm.Recursion;

public class PrintNTimes {
    public static void printName(int i, int n , String name){
        if(i>n) return;
        System.out.println(i + " "+name);
        printName(i+1, 15,"Tej");
    }
    public static void main(String[] args) {
        printName(1, 15, "Tej");

    }
}
