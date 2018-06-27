package p07decorator;

public class Orc implements Creature {
    @Override
    public String attack() {
        return "Orc attacks with fiery sword";
    }

    @Override
    public Integer getAttackPower() {
        return 13;
    }

    @Override
    public String fleeBattle() {
        return "You colored the orc and runs away";
    }
}
