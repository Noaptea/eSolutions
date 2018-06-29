package p13observer;

import lombok.val;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Weather weather = new Weather();

        weather.addObserver(new PesimisticObserver());
        weather.addObserver(new OptimisticObserver());
        weather.addObserver(RealObserver.builder().name("Gigi Becali").mood("drunk").build());

        val keyboard = new Scanner(System.in);

        while (true){
            val command = keyboard.nextLine();

            if("q".equalsIgnoreCase(command.trim())){
                break;
            }
            weather.timePasses();
        }

    }
}
