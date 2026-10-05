import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // HYPOTENUSE = Math.sqrt(a² + b²)

        //         double a;
        //         double b;
        //         double c;
        //
        //         System.out.print("Enter A: ");
        //         a = scanner.nextDouble();
        //
        //         System.out.print("Enter B: ");
        //         b = scanner.nextDouble();
        //
        //         c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        //
        //         System.out.println("Hypotenuse: " + c + " cm²");

        // Circumference = 2 * Math.PI * radius
        // Area = Math.PI * Math.pow(radius, 2)
        // Volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The Circumference is: %.1fcm\n", circumference);
        System.out.printf("The Area is: %.1fcm²\n", area);
        System.out.printf("The Volume is: %.1fcm³\n", volume);

        scanner.close();
    }
}
