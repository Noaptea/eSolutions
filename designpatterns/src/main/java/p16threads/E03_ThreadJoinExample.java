package p16threads;

import lombok.val;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class E03_ThreadJoinExample {
    public static void main(String[] args) {
        val t1 = new Thread(()->{
            System.out.println("Entered thread 1");
           try{
               TimeUnit.SECONDS.sleep(2);
           }
           catch (InterruptedException e){
               e.printStackTrace();
           }
            System.out.println("Exited thread 1");
        });

        val t2 = new Thread(()->{
            System.out.println("Entered thread 2");
            try{
                TimeUnit.SECONDS.sleep(4);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Exited thread 1");
        });

        System.out.println("Started thread 1");
        t1.start();
        System.out.println("Waiting for thread 1 to end");

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("T1 is done");

        System.out.println("Starting thread 2");
        t2.start();

    }
}
