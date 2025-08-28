package dateandtime;

import java.time.LocalDateTime;

public class LocalDateTImeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime event = LocalDateTime.of(2025, 8, 28, 14, 30);
        System.out.println("Current date and time: "+  now);
        System.out.println("event date and time "+ event);
    }
}
