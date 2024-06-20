package Algorithm.Recursion;

public class PrintNumber {
    static int cnt = 0;
    public static void print(){
        if(cnt == 5) return;
        cnt++;
        System.out.println(cnt);
        print();

    }
    public static void main(String[] args) {
        print();

    }
}
