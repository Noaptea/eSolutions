package p07decorator;

import lombok.Builder;

public class CreatureFactory {

    private static Integer power;

    public static Creature createPony() {
        return new Pony();
    }

    public static Creature createOrc() {
        return  new Orc();
    }

    public static Brimstones.BrimstonesBuilder upgradedCreature(Creature creature) {
        return  Brimstones.builder().toBeDecorated(creature);
    }
}
