import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Compound Interest Calculator

        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times the interest is compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow((1 + rate / timesCompounded), timesCompounded * years);

        System.out.printf("\nThe amount after %d year/s is: %.2f", years, amount);

        scanner.close();
    }
}