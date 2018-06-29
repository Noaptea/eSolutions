package p16threads;

import lombok.val;

import java.util.concurrent.*;

public class E06_FutureAndCallable {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable<String> callable = () -> {

            System.out.println("Entered callable. Inside thread:  "+Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(4);
            return "Hello from callable";
        };

        val pool = Executors.newSingleThreadExecutor();
        System.out.println("Submit callable");

        long startTime = System.nanoTime();

        Future<String> future = pool.submit(callable);

        System.out.println("Doing something else meanwhile");


        while (!future.isDone()){

            val elapsedTime = (System.nanoTime() - startTime) /1_000_000_000.0;

            if(elapsedTime > 1){
                future.cancel(true);
            }
            System.out.println("Are we done yet ?");
            System.out.println("No");
            TimeUnit.MILLISECONDS.sleep(200);
        }

        if(future.isCancelled()){
            System.out.println("Trip was canceled");
        }
        else{
            System.out.println("Done");
            System.out.println(future.get());
        }

        pool.shutdown();

    }

}
