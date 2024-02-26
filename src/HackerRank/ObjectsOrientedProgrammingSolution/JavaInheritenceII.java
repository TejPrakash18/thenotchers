package HackerRank.ObjectsOrientedProgrammingSolution;

class Arithmetic{
    public int add(int a, int b){
        int sum = a+b;
        return sum;

    }
}
class Adder extends Arithmetic{
    public int addCall(int a, int b){
        return add(a,b);
    }
}
public class JavaInheritenceII {
    public static void main(String[] args) {
        Adder obj = new Adder();
        System.out.println("My superclass is: " + obj.getClass().getSuperclass().getName());
        System.out.print(obj.add(10,32) + " " + obj.add(10,3) + " " + obj.add(10,10) + "\n");
    }
}
