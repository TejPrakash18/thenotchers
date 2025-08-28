package dateandtime;
import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(14, 30);
        Duration duration = Duration.between(start, end);
        System.out.println("Duration "+ duration);


    }
}
