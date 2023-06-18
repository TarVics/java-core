package multithreading.task4_Wait_and_Notify;

import java.util.LinkedList;

public class Processor {
    private final LinkedList<Integer> list = new java.util.LinkedList<>();
    private final Object lock = new Object();
    private final int LIMIT = 10;

    public void produce() {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (list.size() == LIMIT) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                list.add(value++);
                lock.notify();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (lock) {
                while (list.isEmpty()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("List size: " + list.size());
                int value = list.removeFirst();
                System.out.println("; Removed value: " + value);
                lock.notify();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
