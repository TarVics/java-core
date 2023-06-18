package multithreading.task2_Basic_Synchronized;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                worker.increment();
            }
        };

        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Thread-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + worker.getCount());
    }
}
