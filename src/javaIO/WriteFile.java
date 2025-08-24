package javaIO;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("output.txt")){
            fw.write("Hello, Java I/O\n");
            fw.write("This is a text file ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
