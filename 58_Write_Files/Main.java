import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // How to write a file using Java (4 popular options)
        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "test.txt";
        String text = """
        Billie Jean
        Is not my lover
        """;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
        }
    }
}
