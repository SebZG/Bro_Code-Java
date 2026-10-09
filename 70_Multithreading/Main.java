public class Main {

    public static void main(String[] args) {
        // Multithreading = Enables a program to run multiple threads concurrently
        //                               (Thread = A set of instructions that run independently)
        //                               Useful for background tasks or time-consuming operations

        Thread thread0 = new Thread(new MyRunnable("PING"));
        Thread thread1 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");

        thread0.start();
        thread1.start();

        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");
    }
}
