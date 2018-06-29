package p16threads;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class E04_ExecutorsExample {
    public static void main(String[] args) {
        System.out.println("Inside: "+Thread.currentThread().getName());

        System.out.println("Creating an executor pool with 2 threads");
        ExecutorService executorPool = Executors.newFixedThreadPool(2);

        Runnable task1 = createRunnable("T1", 1);
        Runnable task2 = createRunnable("T2", 2);
        Runnable task3 = createRunnable("T3", 7);
        Runnable task4 = createRunnable("T4", 4);
        Runnable task5 = createRunnable("T5", 5);

        executorPool.submit(task1);
        executorPool.submit(task2);
        executorPool.submit(task3);
        executorPool.submit(task4);
        executorPool.submit(task5);

        executorPool.shutdown();

    }

    private static Runnable createRunnable(String name, Integer timeout) {
        return () -> {
                System.out.println(name + " inside: " + Thread.currentThread().getName());

                try {
                    TimeUnit.SECONDS.sleep(timeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            };
    }
}
