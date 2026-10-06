import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ternary Operator: ? = return 1 of 2 values if a condition is true
        // Variable = (condition) ? ifTrue : ifFalse;

//         int score = 70;
//         String passFail = score >= 60 ? "PASS" : "FAIL";
//         if (score >= 60) {
//             System.out.println("PASS");
//         } else {
//             System.out.println("FAIL");
//         }
//         System.out.println(passFail);
//
//         int number = 3;
//
//         String evenOrOdd = number % 2 == 0 ? "EVEN" : "ODD";
//
//         System.out.println(evenOrOdd);

        int hours = 13;

        String timeOfDay = hours < 12 ? "AM" : "PM";

        System.out.println(timeOfDay);
    }
}
