import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that
        //                  represents a fixed set of constants.
        //                  They improve code readability and reliability.
        //                  More efficient with switches than Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);

            System.out.println(day);
            System.out.println(day.getDayNumber());

            switch (day) {
                case
                    MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is a weekend");
                default -> System.out.println("Invalid day");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        scanner.close();
    }
}
