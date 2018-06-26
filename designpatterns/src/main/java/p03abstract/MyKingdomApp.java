package p03abstract;

import p03abstract.interfaces.Army;
import p03abstract.interfaces.Castle;
import p03abstract.interfaces.King;
import p03abstract.interfaces.KingdomFactory;

import java.util.Optional;
import java.util.Scanner;

public class MyKingdomApp {

    private King king;
    private Castle castle;
    private Army army;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String option = "";

        while(true){

            System.out.println("\nChose your kingdom type: ");
            option = keyboard.nextLine();

            if("exit".equalsIgnoreCase(option.trim())){
                System.out.println("Thanks for playing");
                return;
            }

            Optional<KingdomFactory> yourFactory = FactoryMaker.makeFactory(option);

            if(yourFactory.isPresent()){
                MyKingdomApp myKingdom = new MyKingdomApp();

                myKingdom.createKingdom(yourFactory.get());

                myKingdom.printKingdomDescription();
            }

        }


    }

    private void createKingdom (KingdomFactory factory){
        this.king = factory.createKing();
        this.castle = factory.createCastle();
        this.army = factory.createArmy();
    }

    public void printKingdomDescription(){
        System.out.println(String.format("My army: %s\nMy Castle: %s\nMy King: %s", army.getArmyDescription(), castle.getCastleDescription(), king.getKingDescription()));
    }


}
