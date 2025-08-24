package javaIO;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("output.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
