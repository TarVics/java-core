package multithreading.task5_ReentrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    private int count = 0;
    private final Lock reentrantLock = new ReentrantLock();
    private final Condition condition = reentrantLock.newCondition();

    public void increment() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }

    public void firstThreadJob() {
        reentrantLock.lock();
        System.out.println("Waiting...");
        try {
            try {
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Woken up!");

            increment();

            System.out.println("First Thread is Done!");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void secondThreadJob() {
        reentrantLock.lock();
        System.out.println("Press return key!");
        new Scanner(System.in).nextLine();
        System.out.println("Received return key!");
        condition.signal();

        try {
            increment();
            System.out.println("Second Thread is Done!");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void finishState() {
        System.out.println("Final count: " + count);
    }
}
