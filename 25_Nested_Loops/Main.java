import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Nested Loops - A loop inside another loop

        Scanner scanner = new Scanner(System.in);

        int rows;
        int cols;
        char sym;

        System.out.print("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter # of cols: ");
        cols = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        sym = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sym);
            }
            System.out.println();
        }

        scanner.close();
    }
}
