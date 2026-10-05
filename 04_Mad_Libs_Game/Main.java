import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Mad Libs Game

        Scanner scanner = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("Enter an adjective (desecription): ");
        adj1 = scanner.nextLine();
        System.out.print("Enter an noun (animal/person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (desecription): ");
        adj2 = scanner.nextLine();
        System.out.print("Enter an verb ending with 'ing' (running/dancing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (desecription): ");
        adj3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adj1 + " zoo");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");

        scanner.close();
    }
}