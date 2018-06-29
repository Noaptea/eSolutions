package p16threads;

import lombok.val;

public class E02_RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println(
                String.format("Inside: \"%s\" ...",Thread.currentThread().getName())
        );
    }

    public static void main(String[] args) {
        System.out.println(
                String.format("Inside: \"%s\" ...",Thread.currentThread().getName())
        );

        val r1 = new E02_RunnableExample();
        val t1 = new Thread(r1);

        t1.start();

        val t2 = new Thread(()->
            System.out.println(
                    String.format("Inside: \"%s\" ...",Thread.currentThread().getName())
            ));
        t2.start();
    }
}
