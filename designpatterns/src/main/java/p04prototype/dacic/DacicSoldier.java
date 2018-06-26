package p04prototype.dacic;

import p04prototype.Soldier;

public class DacicSoldier extends Soldier {

    private final String superpower;

    public DacicSoldier (String superpower){
        this.superpower = superpower;
    }

    private DacicSoldier (DacicSoldier prototype) {
        this.superpower = prototype.superpower;
    }

    @Override
    public Soldier copy() throws CloneNotSupportedException {
        return new DacicSoldier(this);
    }

    @Override
    public String toString() {
        return String.format("Superpower is: %s", superpower);
    }
}
