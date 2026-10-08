public class Main {

    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE

        Car car = new Car("Yellow", "Charger", 10000);

        // Cannot access it
        // car.model = "Corvette";

        System.out.printf(
            "%s %s: %s\n",
            car.getColor(),
            car.getModel(),
            car.getPrice()
        );

        car.setColor("Red");
        car.setPrice(12000);

        System.out.printf(
            "%s %s: %s\n",
            car.getColor(),
            car.getModel(),
            car.getPrice()
        );
    }
}
