package Oops.Interface;



//interface to help achieve multiple inheritance
public class MultipalInterface implements InterfaceOne, InterfaceTwo {

    @Override
    public void getName() {
        System.out.print("Tej ");
    }

    @Override
    public void getAddress() {
        System.out.println("from Hathras ");
    }

    public static void main(String[] args) {
        MultipalInterface obj = new MultipalInterface();
        obj.getName();
        obj.getAddress();

    }
}
