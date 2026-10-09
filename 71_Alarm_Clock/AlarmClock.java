import java.time.LocalTime;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;

    AlarmClock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {
        // LocalTime now = LocalTime.now();

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                // int hours = LocalTime.now().getHour();
                // int minutes = LocalTime.now().getMinute();
                // int seconds = LocalTime.now().getSecond();

                LocalTime now = LocalTime.now();

                // int hours = now.getHour();
                // int minutes = now.getMinute();
                // int seconds = now.getSecond();

                System.out.printf(
                    "\r%02d:%02d:%02d",
                    now.getHour(),
                    now.getMinute(),
                    now.getSecond()
                );
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
