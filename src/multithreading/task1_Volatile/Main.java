package multithreading.task1_Volatile;

public class Main {
    /*
        volatile - variable is not being copied into local thread.
        There is used direct access to the variable from the thread
    */
    public static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> {
            for (int i = 0; i < 2000; i++) {
                System.out.println("Runnable value: " + i);
            }

            running = false;
            System.out.println("Runnable state: " + running);
        };

        Runnable runnable2 = () -> {
            int i = 0;
            while (running) {
                i++;
            }
            System.out.println("Runnable 2 value: " + i);
        };

        Thread thread1 = new Thread(runnable1, "My-Thread-1");
        Thread thread2 = new Thread(runnable2, "My-Thread-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("All threads are completed");
    }
}
