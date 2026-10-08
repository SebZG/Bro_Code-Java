public class Car {

    private String color;
    private final String model;
    private int price;

    Car(String color, String model, int price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    String getColor() {
        return this.color;
    }

    String getModel() {
        return this.model;
    }

    String getPrice() {
        return "$" + this.price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price can't be less than 0");
        } else {
            this.price = price;
        }
    }
}
