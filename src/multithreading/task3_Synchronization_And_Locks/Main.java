package multithreading.task3_Synchronization_And_Locks;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Generator generator = new Generator();
        Runnable runnable = generator::generate;

        System.out.println("System starting...");
        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long totalTime = System.currentTimeMillis() - startTime;

        System.out.println("Time elapsed: " + totalTime);
        System.out.println("List1: " + generator.getList1().size());
        System.out.println("List2: " + generator.getList2().size());
    }
}
