package multiThreading;

import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };

        Callable<String> task1 = () -> {
            Thread.sleep(1000);
            return "Tej";
        };



        Future<Integer> future = executor.submit(task);
        Future<String> future1 = executor.submit(task1);

        System.out.println("Is done task 1? " + future.isDone());
        System.out.println("Result: " + future.get());
        System.out.println("Is done task 1? " + future.isDone());
        System.out.println("Is done task 2? "+ future1.isDone());
        System.out.println("Result 2: "+ future1.get());// blocks until result is ready

        executor.shutdown();
    }
}
