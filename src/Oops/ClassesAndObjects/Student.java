package Oops.ClassesAndObjects;

public class Student {
    public static void main(String[] args) {
        StudentDetails obj =  new StudentDetails();

        obj.printDetails();
    }
}

class StudentDetails{
    int studentId = 24290;
    int rollno = 92;
    int age = 22;
    String phoneNumber = "8171480579";

    String name = "Tej";
    String stream = "BCA" ;
    String address = "Iglas, Aligarh";

    void printDetails(){
        System.out.println("Student id = "+ studentId);
        System.out.println("Student class roll number = "+rollno);
        System.out.println("Student name = " + name);
        System.out.println("Student Stream = "+ stream);
        System.out.println("Student Address = " + address);
        System.out.println("Student age = "+ age);
        System.out.println("Student phone number = " + phoneNumber);
    }
}
