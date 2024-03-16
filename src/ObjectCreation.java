class Students{
    int rollNo =001;
    String name= "Trishika";
}
public class ObjectCreation {

    public static void main(String[] args) {
        Students obj = new Students();
        String name = obj.name;
        int roll = obj.rollNo;
        System.out.println(name +" "+ roll);

    }
}
