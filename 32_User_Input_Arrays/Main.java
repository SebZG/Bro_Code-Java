import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // User Input into Arrays

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("Enter # foods: ");
        size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];

        // foods[0] = "Pizza";
        // foods[1] = "Sancocho";
        // foods[2] = "Arepa";
        // foods[3] = null;
        // foods[4] = null;

        for (int i = 0; i < foods.length; i++) {
            System.out.printf("Enter #%d food: ", i + 1);
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
