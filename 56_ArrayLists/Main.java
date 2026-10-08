import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Arrayfruits = A resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but Arrayfruitss can change (dynamic)

        //         ArrayList<String> fruits = new ArrayList<>();
        //
        //         fruits.add("Papaya");
        //         fruits.add("Mango");
        //         fruits.add("Apple");
        //         System.out.println(fruits);
        //
        //         fruits.remove(0);
        //         System.out.println(fruits);
        //
        //         fruits.set(1, "Coconut");
        //         System.out.println(fruits);
        //
        //         System.out.println(fruits.get(0));
        //         System.out.println(fruits.size());
        //         Collections.sort(fruits);
        //         System.out.println(fruits);
        //
        //         for (String fruit : fruits) {
        //             System.out.println(fruit);
        //         }

        // Exercise
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfFood; i++) {
            System.out.printf("Enter food #%d: ", (i + 1));
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
