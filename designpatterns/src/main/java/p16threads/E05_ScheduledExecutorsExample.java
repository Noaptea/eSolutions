package p16threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class E05_ScheduledExecutorsExample{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Nu sunati la usa !  ...Iesim noi din cand in cand");

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);

        Runnable eCinevaLaUsa = () -> System.out.println(Thread.currentThread().getName() + " verifica daca e cineva la usa...");

        pool.scheduleAtFixedRate(()-> System.out.println(Thread.currentThread().getName()+ " watch TV..."), 2, 3, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(eCinevaLaUsa,0,2,TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(10);
        pool.shutdown();

    }
}
