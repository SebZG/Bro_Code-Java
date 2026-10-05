public class Main {

    public static void main(String[] args) {
        // Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y; // ADDITION
        z = x - y; // SUBTRACTION
        z = x * y; // MULTIPLICATION
        z = x / y; // DIVISION
        z = x % y; // MODULUS

        System.out.println(z);

        x++; // INCREMENT
        x--; // DECREMENT

        // ORDER OF OPERATIONS - PEMDAS
        // Parentheses, Exponents, Multiplication, Division, Addition, Subtraction

        double result = 3 + (4 * (7 - 5)) / 2.0;

        System.out.println(result);
    }
}
