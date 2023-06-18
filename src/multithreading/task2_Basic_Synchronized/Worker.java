package multithreading.task2_Basic_Synchronized;

public class Worker {
    private int count = 0;

    public int getCount() {
        return count;
    }

    /*
      Only one thread can access a method or object at a time
    */
    public synchronized void increment() {
        count = count + 1;
        System.out.println("Thread in progress: " + Thread.currentThread().getName() + ". Count is: " + count);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
