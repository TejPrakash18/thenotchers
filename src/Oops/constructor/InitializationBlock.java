package Oops.constructor;


class Test{
    static int staticVar;
    int intanceVar;

    static {
        System.out.println("called static block. it called only once have class is load");
        staticVar= 100;
    }
    //instance block
    {
        System.out.println("instance block called, it called every time when your construtor");
        intanceVar = 98;
    }
    Test(){
        System.out.println("constructor called");
    }
}
public class InitializationBlock {
    public static void main(String[] args) {
        Test obj1 = new Test();

        Test obj2 = new Test();
    }
}
