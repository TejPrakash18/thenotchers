package collection.comparables;
import  java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.roll - s.roll; // ascending by roll
    }

    @Override
    public String toString() {
        return roll + " - " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Alice"));
        list.add(new Student(1, "Bob"));
        list.add(new Student(2, "Charlie"));

        Collections.sort(list); // uses compareTo()

        System.out.println(list);
    }
}
