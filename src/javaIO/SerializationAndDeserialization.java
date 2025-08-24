package javaIO;


import java.io.*;

class Student implements Serializable{
    private static final long serialVersionId = 1L;
    String name;
    int age;
    transient String password;

    Student(String name, int age, String password){
        this.name = name;
        this.age = age;
        this.password =password;
    }
}
public class SerializationAndDeserialization {
    public static void main(String[] args) {
        Student s1 = new Student("Tej" ,22, "MySecret123");
        Student s3 = new Student("Tarun" ,22, "MySecret123");


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))){
            oos.writeObject(s1);
            oos.writeObject(s3);
            System.out.println("Add data Serialzation");
        }catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))){
            Student s2 = (Student) ois.readObject();
            Student s4 = (Student) ois.readObject();
            System.out.println("Name: "+ s2.name);
            System.out.println("Age : "+ s2.age);
            System.out.println("Password: "+ s2.password);
            System.out.println("Name: "+ s4.name);
            System.out.println("Age : "+ s4.age);
            System.out.println("Password: "+ s4.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
