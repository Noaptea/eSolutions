package p17command;

import lombok.val;

import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Target target = new Target(Size.SMALL, Visibility.VISIBLE);

        System.out.println(target);

        val invisibility = new InvisibilitySpell();
        val shrink = new ShrinkSpell();
        val keyboard = new Scanner(System.in);

        Optional<Command> lastSpell = Optional.empty();

        while(true){
            System.out.println("Cast spell: ");
            val command = keyboard.nextLine().toLowerCase().trim();

            switch (command){
                case "shrink":
                    shrink.execute(target);
                    lastSpell = Optional.of(shrink);
                    break;
                case "invisible":
                    invisibility.execute(target);
                    lastSpell = Optional.of(invisibility);
                    break;
                case "oops":
                    if(lastSpell.isPresent()){
                        lastSpell.get().undo();
                    }
                    break;
                case "redo":
                    if(lastSpell.isPresent()){
                        lastSpell.get().redo();
                    }
                    break;
                default:
                    System.out.println(String.format("Sorry, your %s spell has fizzled...", command));
                    System.out.println("Possible options: ");
            }

            System.out.println(target);
        }
    }
}
