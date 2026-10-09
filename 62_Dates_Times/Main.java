import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        //         How to work with DATES & TIMES using Java
        //         (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
        //
        //                 LocalDate date = LocalDate.now();
        //                 LocalTime time = LocalTime.now();
        //                 LocalDateTime dateTime = LocalDateTime.now();
        //                 Instant timestamp = Instant.now(); // UTC timestamp
        //
        //                 System.out.println(date);
        //                 System.out.println(time);
        //                 System.out.println(dateTime);
        //                 System.out.println(timestamp);
        //
        //         Custom format
        //         LocalDateTime dateTime = LocalDateTime.now();
        //         DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
        //             "dd-MM-yyyy HH:mm:ss"
        //         );
        //         String newDateTime = dateTime.format(formatter);
        //         System.out.println(newDateTime);
        //
        //         LocalDate localDate = LocalDate.of(2024, 12, 25);
        //         System.out.println(localDate);
        //
        //         LocalDateTime localDateTime = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        //         System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);

        if (localDateTime1.isBefore(localDateTime2)) {
            System.out.printf(
                "%s is earlier than %s\n",
                localDateTime1,
                localDateTime2
            );
        } else if (localDateTime1.isAfter(localDateTime2)) {
            System.out.printf(
                "%s is later than %s",
                localDateTime1,
                localDateTime2
            );
        } else if (localDateTime1 == localDateTime2) {
            System.out.printf(
                "%s is equal to %s",
                localDateTime1,
                localDateTime2
            );
        }
    }
}
