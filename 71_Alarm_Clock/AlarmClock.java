import java.time.LocalTime;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;

    AlarmClock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }
}
