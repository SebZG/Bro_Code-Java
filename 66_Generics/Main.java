import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method
        //                     that is compatible with different data types.
        //                    <T> type parameter (placeholder that gets replaced with a real type)
        //                    <String> type argument (specifies the type)

        //         ArrayList<String> fruits = new ArrayList<>();
        //
        //         fruits.add("Apple");
        //         fruits.add("Banana");
        //         fruits.add("Coconut");

        Box<String> box = new Box<>();

        box.setItem("banana");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Apple", .50);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        Product<String, Integer> product2 = new Product<>("Tickets", 15);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
