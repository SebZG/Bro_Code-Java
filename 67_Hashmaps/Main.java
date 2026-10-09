import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.30);
        map.put("Coconut", 2.00);

        // map.remove("Apple");

        //         System.out.println(map.get("Apple"));
        //         System.out.println(map.containsKey("Banana"));
        //
        //         if (map.containsKey("Pineapple")) {
        //             System.out.println(map.get("Pineapple"));
        //         } else {
        //             System.out.println("Key not found");
        //         }
        //
        //         System.out.println(map.containsValue(1.00));
        //         System.out.println(map.size());

        System.out.println(map);
        for (String k : map.keySet()) {
            System.out.printf("%s : $%.2f\n", k, map.get(k));
        }
    }
}
