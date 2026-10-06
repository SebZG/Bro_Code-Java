import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // WEIGHT CONVERTER

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Converter");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Select 1/2: ");
        choice = scanner.nextInt();

        // System.out.println(choice);

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        } else {
            System.out.println("That was not a valid choice.");
        }

        scanner.close();
    }
}
