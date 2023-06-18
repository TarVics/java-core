package multithreading.task5_ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        Thread thread1 = new Thread(runner::firstThreadJob, "First-Thread");
        Thread thread2 = new Thread(runner::secondThreadJob, "Second-Thread");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finishState();
    }
}
