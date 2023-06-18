package multithreading.task6_Executors;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // One task - One thread
        //ExecutorService executorService = Executors.newCachedThreadPool();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 300; i++) {
            String uuid = UUID.randomUUID().toString();
            MessageProcessor messageProcessor = new MessageProcessor(uuid);
            executorService.execute(messageProcessor);
//            Future<?> submit = executorService.submit(messageProcessor);
//            System.out.println(i);
        }

        executorService.shutdown();

        //executorService.awaitTermination()

        while (!executorService.isTerminated()) {

        }

        long end = System.currentTimeMillis();
        System.out.printf("Time taken: %s ms", (end - start));
    }
}
