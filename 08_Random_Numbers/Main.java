import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

//         int number;
//         number = random.nextInt(1, 6); // 1-5
//         System.out.println(number);
//
//         double number;
//         number = random.nextDouble(1, 6); // 1.0-5.999999999999999
//         System.out.println(number);

        boolean isHeads;
        isHeads = random.nextBoolean(); // true or false
        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
