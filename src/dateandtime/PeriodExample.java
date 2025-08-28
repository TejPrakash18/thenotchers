package dateandtime;

import java.time.LocalDate;
import java.time.Period;



public class PeriodExample {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.of(2025, 8, 28);
        Period diff = Period.between(start, end);
        System.out.println("difference between "+ diff);
    }
}
