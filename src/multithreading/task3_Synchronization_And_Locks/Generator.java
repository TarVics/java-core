package multithreading.task3_Synchronization_And_Locks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private final Random random = new Random();

    private final List<Integer> list1 = new ArrayList<>();
    private final List<Integer> list2 = new ArrayList<>();

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public List<Integer> getList1() {
        return list1;
    }

    public List<Integer> getList2() {
        return list2;
    }

//    public synchronized void stageOne() throws InterruptedException {
//        Thread.sleep(1);
//        list1.add(random.nextInt(100));
//    }
    public void stageOne() throws InterruptedException {
        synchronized (lock1) {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }
    }

//    public synchronized void stageTwo() throws InterruptedException {
//        Thread.sleep(1);
//        list2.add(random.nextInt(100));
//    }

    public void stageTwo() throws InterruptedException {
        synchronized (lock2) {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        }
    }

    public void generate() {
        try {
            for (int i = 0; i < 1000; i++) {
                stageOne();
                stageTwo();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
