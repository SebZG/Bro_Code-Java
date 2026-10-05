import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Calculate the area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Width: ");
        width = scanner.nextDouble();

        System.out.print("Height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is : " + area);

        scanner.close();
    }
}
