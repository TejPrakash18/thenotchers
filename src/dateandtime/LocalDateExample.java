package dateandtime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate dob = LocalDate.of(1995, 11, 29);
        LocalDate parsed = LocalDate.parse("2025-10-07");
        System.out.println("current time: "+ now);
        System.out.println("DOB : "+  dob);
        System.out.println("parsed date: "+parsed);
    }
}
