import java.lang.ArithmeticException;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program
        //                      (Dividing by zero, file not found, mismatch input type)
        //                      Surround any dangerous code with a try{} block
        //                       try{}, catch{}, finally{}

        // Scanner scanner = new Scanner(System.in);

        // ArithmeticException
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        // catch (InputMismatchException e) {
        //     System.out.println(e);
        // } catch (ArithmeticException e) {
        //     System.out.println(e);
        // }
        catch (Exception e) { // Not good practice by itself, but can be usefull
            System.out.println("Something went wrong: " + e);
        } finally {
            // scanner.close();
            System.out.println("`finally` block");
        }
    }
}
