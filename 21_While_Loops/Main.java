import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // While Loop - Repeat the same code until condition is true

        Scanner scanner = new Scanner(System.in);

        // EXAMPLE 1

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // EXAMPLE 2

        String response = "";

        while (!response.equals("Q")) {
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit");

        scanner.close();
    }
}
