package Oops.Encapsulation;
class ReadOnly{
    private int amount = 1000;

    int getAmount(){
        return amount;
    }
}

class WriteOnly{
    private String name = "Nehu";

    public void setName(String name){
        this.name = name;
        System.out.println(name);
    }
}
public class ReadWriteOnly {
    public static void main(String[] args) {
        ReadOnly ob = new ReadOnly();
        System.out.println(ob.getAmount());

        WriteOnly obj = new WriteOnly();
        obj.setName("Hey she is Neha she is very cute:) ");
    }
}
