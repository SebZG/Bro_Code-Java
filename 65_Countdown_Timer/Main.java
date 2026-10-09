import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        // Java COUNTDOWN TIMER PROGRAM

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter # of seconds: ");
        int response = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                if (count > 0) {
                    System.out.println(count);
                    count--;
                } else {
                    System.out.println("Happy Birthday!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
        scanner.close();
    }
}
