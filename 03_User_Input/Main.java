import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A simple text scanner whcih can parse
        // primitive types and strings using RegEx

        Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         // String name = scanner.next(); // Read up to the first space.
//         String name = scanner.nextLine(); // Reads spaces until the user presses enter.
//
//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();
//
//         System.out.print("What your GPA: ");
//         double gpa = scanner.nextDouble();
//
//         System.out.print("Are you a student? (true/false): ");
//         boolean isStudent = scanner.nextBoolean();
//
//         System.out.println("Hello, " + name);
//         System.out.println("Your age is " + age);
//         System.out.println("Your GPA is " + gpa);
//         if (isStudent) {
//             System.out.println("You are enrolled in Computer Science!");
//         }
//         else {
//             System.out.println("You are not enrolled in any course yet.");
//         }
//
//         scanner.close();

        // COMMON ISUES

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // If you a int/double then a string, you need to add an extra scanner.nextLine() to consume the newline character.
        scanner.nextLine(); // Consume the newline character.

        System.out.print("Enter you favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Your are " + age + "Years old.");
        System.out.println("You like the color " + color);

        scanner.close();
    }
}
