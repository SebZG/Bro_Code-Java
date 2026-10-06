import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Substring - A method to extract a portion of a string
        // .substring(start, end);

        Scanner scanner = new Scanner(System.in);

        String email;
        String userName;
        String domain;

        System.out.print("Enter your email: ");

        email = scanner.next();
        if (email.contains("@")) {
            userName = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.printf("Username: %s\n", userName);
            System.out.printf("Domain: %s\n", domain);
        } else {
            System.out.println("Email must contain '@'");
        }

        scanner.close();
    }
}
