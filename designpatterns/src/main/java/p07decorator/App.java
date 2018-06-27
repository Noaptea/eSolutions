package p07decorator;

import lombok.val;

public class App {
    public static void main(String[] args) {
        val pony = CreatureFactory.createPony();
        val orc = CreatureFactory.createOrc();

//        val upgradedPony = CreatureFactory.upgradedCreature(pony).upgradePower(10).build();
//        val upgradedOrc = CreatureFactory.upgradedCreature(orc).upgradePower(11).build();

        val upgradedPony = CreatureFactory.upgradedCreature(pony)
                .upgradePower(initial -> initial*2)
                .build();
        val upgradedOrc = CreatureFactory.upgradedCreature(orc)
                .upgradePower(initial -> initial*2)
                .upgradeAttack(x -> "with butterflies")
                .build();


        doTheThing(pony);
        doTheThing(orc);
        doTheThing(upgradedPony);
        doTheThing(upgradedOrc);

    }

    private static void doTheThing(Creature creature) {
        System.out.println("============== ta da da dam ==============");
        System.out.println(String.format("with power: %d", creature.getAttackPower()));
        System.out.println(creature.attack());
        System.out.println(creature.fleeBattle());
        System.out.println("================ the end =================");
    }
}
