package dateandtime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now().withNano(0);
        LocalTime time = LocalTime.of(14, 30, 45); // 14:30:45
        LocalTime parsed = LocalTime.parse("10:15:30");

        System.out.println("current time: "+ now);
        System.out.println("parsed time "+ parsed);
    }
}
