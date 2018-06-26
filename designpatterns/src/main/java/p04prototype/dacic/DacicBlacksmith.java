package p04prototype.dacic;

import p04prototype.Blacksmith;

public class DacicBlacksmith extends Blacksmith {

    private final String superpower;

    public DacicBlacksmith (String superpower){
        this.superpower = superpower;
    }

    private DacicBlacksmith(DacicBlacksmith prototype){
        this.superpower = prototype.superpower;
    }

    @Override
    public Blacksmith copy() throws CloneNotSupportedException {
        return new DacicBlacksmith(this);
    }

    @Override
    public String toString() {
        return String.format("My superpower is: %s", superpower);
    }
}
