import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        while (alarmTime == null) {
            try {
                System.out.print("Enter alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.printf("Alarm set for %s\n", alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format - HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

        scanner.close();
    }
}
