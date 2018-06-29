package p16threads;

import lombok.val;

public class E01_ThreadExample extends Thread {

    @Override
    public void run(){
        System.out.println(
                String.format("Inside: \"%s\" ...",Thread.currentThread().getName())
        );

    }

    public static void main(String[] args) {

        System.out.println(
                String.format("Inside: \"%s\" ...",Thread.currentThread().getName())
        );

        System.out.println("Creating new thread");

        val thread = new E01_ThreadExample();
        System.out.println("Starting new thread");
        thread.start();

    }

}
