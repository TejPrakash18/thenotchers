package DesignPattern.prototype;

public class Student implements Cloneable{
    private String name;
    private String course;

    public Student(String name, String course){
        this.name = name;
        this.course = course;
    }

    public Student clone(){
        try{
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course = course;
    }

    @Override
    public String toString(){
        return "Student{name= ' "+ name +" '+ course= ' " + course +" '}";
    }
}
