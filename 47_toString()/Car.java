public class Car {

    String make;
    String mode;
    int year;
    String color;

    Car(String make, String mode, int year, String color) {
        this.make = make;
        this.mode = mode;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " " + this.year + " " + this.make + " " + this.mode;

    }
}
