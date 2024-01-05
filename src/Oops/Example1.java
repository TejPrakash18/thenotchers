package Oops;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Create an object using" + " `new` "+"keyWord");
        CreateObjet obj = new CreateObjet();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}

class CreateObjet{
    int age =  21;
    String name = "Tej";
}
