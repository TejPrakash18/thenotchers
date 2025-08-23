package multiThreading;

import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            System.out.println("Task executed by " + Thread.currentThread().getName());
        };

//        Runnable task2 = () ->{
//            return (String) "Tej";
//        };

        //Runnable does not return a values any where.

        for (int i = 1; i <= 5; i++) {
            executor.submit(task);
            executor.submit(task2);
        }

        executor.shutdown();
    }
}
