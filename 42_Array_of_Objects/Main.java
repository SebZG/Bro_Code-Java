public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "red");
        Car car2 = new Car("Willys", "blue");
        Car car3 = new Car("Charger", "Yellow");

        // Car[] cars = new Car[3];
        // Car[] cars = { car1, car2, car3 };
        // Anonymous objects
        Car[] cars = {
            new Car("Mustang", "red"),
            new Car("Willys", "blue"),
            new Car("Charger", "Yellow"),
        };

        // for (int i = 0; i < cars.length; i++) {
        //     cars[i].drive();
        // }
        for (Car car : cars) {
            car.drive();
        }

        for (Car car : cars) {
            car.color = "black";
            car.drive();
        }
    }
}
