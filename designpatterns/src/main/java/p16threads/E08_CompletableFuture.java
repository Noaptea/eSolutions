package p16threads;

import lombok.val;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class E08_CompletableFuture {

    public static void main(String[] args) throws InterruptedException {

        val pool = Executors.newFixedThreadPool(8);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Waiting in first future" + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";

        }, pool);

        CompletableFuture<String> f2 = future.thenApplyAsync(result -> {
            System.out.println("Waiting in second future" + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Second "+ result;
        }, pool);

        f2.thenAcceptAsync(result -> {
            System.out.println("Printing results in: " + Thread.currentThread().getName());
            System.out.println(result);
        }, pool);

        val keyboard = new Scanner(System.in);
        keyboard.nextLine();

        pool.shutdown();

//        TimeUnit.SECONDS.sleep(15);
    }

}
