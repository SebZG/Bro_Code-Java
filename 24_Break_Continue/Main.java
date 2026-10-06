public class Main {

    public static void main(String[] args) {
        // Break - Break out of current loop (STOP)
        // Continue - Skip current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++) {
            if (i == 2) continue;
            if (i == 5) break;
            System.out.println(i + " ");
        }
    }
}
