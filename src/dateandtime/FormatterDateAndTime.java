package dateandtime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FormatterDateAndTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

// Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = now.format(formatter); // "28-08-2025 15:45:00"

// Parsing
        LocalDateTime parsed = LocalDateTime.parse("28-08-2025 15:45:00", formatter);

        System.out.println("formatted "+ formatted);
        System.out.println("parsed " + parsed);
    }
}
