package p04prototype;

import p04prototype.dacic.DacicFactory;

import java.util.Optional;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        DacicFactory factory = DacicFactory.getFactory();
        Optional<Soldier> soldier = factory.createSoldier();
        Optional<Blacksmith>blacksmith = factory.createBlacksmith();
        Optional<Politician>politician = factory.createPolitician();

        System.out.println(soldier.get());
        System.out.println(blacksmith.get());
        System.out.println(politician.get());
    }

}
