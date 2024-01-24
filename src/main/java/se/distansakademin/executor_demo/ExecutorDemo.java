package se.distansakademin.executor_demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            System.out.println("Starting executor");
            try{

                for (int i = 0; i < 15; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(i);
                }

                System.out.println("End of execution in executor");
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("Before shutdown");
        executor.shutdown();
        System.out.println("After shutdown");

        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("Execution done");
    }
}
