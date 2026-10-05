import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Shopping Cart

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';

        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many " + item + "'s would you like?: ");
        quantity = scanner.nextInt();

        System.out.println("\nYou would like:");
        System.out.println(quantity + " " + item + "'s at " + currency + price + " each.");
        System.out.println("Total: " + currency + (price * quantity));

        scanner.close();
    }
}
