public class Main {

    public static void main(String[] args) {
        // ❎ variable = A reusable container for a value.
        //                          A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs   🟦 Reference
        //    ---------         ---------
        //    int               string
        //    double            array
        //    char              object
        //    boolean

        int age = 35;

        System.out.println("I am " + age);

        double price = 5.5;

        System.out.println("The price is " + price);

        char grade = 'A';

        System.out.println("You got: " + grade);

        boolean canCode = true;

        if (canCode) {
            System.out.println("Can code? " + canCode);
        }
        else {
            System.out.println("Can not code :(");
        }

        String name = "Sebastian ZG";

        System.out.println("Hello, " + name);
    }
}
