package javaIO;

import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.Formatter;

public class FormatterFileExample {
    public static void main(String[] args) throws FileNotFoundException {
        Formatter fmt = new Formatter("output.txt");

        Formatter fmt1 = new Formatter();

        fmt.format("ID: %d, Name: %s, Salary: %.2f", 101, "Tej", 55000.50);
        fmt.close();
        System.out.println("Formatted data written to file.");


        fmt1.format("Name: %s, Age: %d, GPA: %.2f", "Tej", 22, 8.75);
        System.out.println(fmt1);
        fmt1.close();
    }
}
