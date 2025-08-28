package collection.comparables;
import java.util.*;
import  java.lang.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return roll + " - " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // alphabetical
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Alice"));
        list.add(new Student(1, "Charlie"));
        list.add(new Student(2, "Bob"));

        Collections.sort(list, new NameComparator());

        System.out.println(list);
    }
}
