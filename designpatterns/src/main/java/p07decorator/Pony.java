package p07decorator;

public class Pony implements Creature {
    @Override
    public String attack() {
        return "Pony attacks with rainbows";
    }

    @Override
    public Integer getAttackPower() {
        return 7;
    }

    @Override
    public String fleeBattle() {
        return "Pony is scared and runs away";
    }
}
