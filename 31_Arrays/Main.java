import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Array - A collection of values of the same data type

        String[] fruits = { "Banana", "Orange", "Coconut" };

//         System.out.println(fruits[0]);
//
//         fruits[0] = "Mango";
//
//         System.out.println(fruits[0]);
//
//         int numOfFruits = fruits.length;
//
//         System.out.println(numOfFruits);
//
//         for (int i = 0; i < fruits.length; i++) {
//             System.out.println(fruits[i]);
//         }
//
//         Arrays.sort(fruits);

        Arrays.fill(fruits, "Apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
