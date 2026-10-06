import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = { 1, 6, 2, 5, 7 };
        System.out.print("Enter a number to search for: ");
        int target1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        boolean isFound1 = false;

        for (int i = 0; i < nums.length; i++) {
            if (target1 == nums[i]) {
                System.out.printf("Element found at index: %d\n", i);
                isFound1 = true;
                break;
            }
        }

        if (!isFound1) {
            System.out.println("Element not found in the Array.");
        }

        String[] strs = { "Bro", "Code", "is", "the", "best" };
        System.out.print("Enter a word to search for: ");
        String target2 = scanner.nextLine();
        boolean isFound2 = false;

        for (int i = 0; i < strs.length; i++) {
            if (target2.equals(strs[i])) {
                System.out.printf("Element found at index: %d", i);
                isFound2 = true;
                break;
            }
        }

        if (!isFound2) {
            System.out.println("Element not found in the Array.");
        }

        scanner.close();
    }
}
