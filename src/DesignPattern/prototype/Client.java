package DesignPattern.prototype;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Tej", "BCA");
        System.out.println(student.toString());
        Student tp = student.clone();
        tp.setName("TP");
        System.out.println(tp.toString());
        Student neha = student.clone();
        neha.setName("Neha");
        neha.setCourse("CA");
        System.out.println(neha.toString());
    }
}
