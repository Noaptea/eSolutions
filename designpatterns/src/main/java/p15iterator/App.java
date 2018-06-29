package p15iterator;

import lombok.val;

import java.util.Iterator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        val keyboard = new Scanner(System.in);
        IterableEnum<Fruits> iterable = new IterableEnum<>(Fruits.APPLE);

        Iterator<Fruits> it = iterable.iterator();

        while(true){
            val command = keyboard.nextLine();
            if("q".equalsIgnoreCase(command)){
                return;
            }

            System.out.println(it.next());
        }


    }

}
