import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously
        //                       Helps improve performance with time-consuming operations
        //                      (File I/O, network communications, or any background tasks)
        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // Ends the thread when the main thread ends
        thread.start();
        
        System.out.println("You have 5 seconds to enter your name");

//         for (int i = 1; i <= 5; i++) {
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
// 
//             if (i == 5) {
//                 System.out.println("Times up!");
//             }
//         }

        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s\n", name);

        scanner.close();
    }
}
