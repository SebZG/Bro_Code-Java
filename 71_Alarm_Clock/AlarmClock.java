import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
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

        System.out.println("\n*ALARM NOISES*");
        // Toolkit.getDefaultToolkit().beep();
        playSound(filePath);
    }

    private void playSound(String filePath) {
        File audioFile = new File(filePath);

        try (
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(
                audioFile
            )
        ) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.printf("Press *ENTER* to stop the alam: ");
            scanner.nextLine();
            clip.stop();
            scanner.close();
            // Thread.sleep(5000); // Play sound for 5 seconds
        } catch (UnsupportedAudioFileException e) {
            System.out.println(e);
        } catch (LineUnavailableException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        // catch (InterruptedException e) {
        //     System.out.println(e);
        // }
    }
}
