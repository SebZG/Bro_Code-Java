import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) {
        // How to PLAY AUDIO with Java (.wav, .au, .aiff)

        String filePath = "beat.aif";
        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(
                file
            );

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {
                System.out.println("P (play)");
                System.out.println("S (stop)");
                System.out.println("R (reset)");
                System.out.println("Q (quit)");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Not a valid response");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (LineUnavailableException e) {
            System.out.println(e);
        } catch (UnsupportedAudioFileException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Bye!");
        }
    }
}
