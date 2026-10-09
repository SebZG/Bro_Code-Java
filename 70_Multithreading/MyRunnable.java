public class MyRunnable implements Runnable {

    private final String text;

    MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.printf("%d: %s - %s\n", i, Thread.currentThread().getName(), text);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}
