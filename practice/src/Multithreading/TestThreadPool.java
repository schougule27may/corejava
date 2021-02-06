package Multithreading;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        //creating a pool of 5 threads.
        for (int i = 0; i < 7; i++) {
            Runnable worker = new WorkerThread(" "+i);
            executor.execute(worker);
        }
        executor.shutdown();
        System.out.println("About to finish worker thread" + new Date());
        while (!executor.isTerminated()){
            // System.out.println(" Still waiting" + new Date());
        }
        System.out.println("finish all worker thread" + new Date());
        System.out.println("Finished all threads");
    }
}
