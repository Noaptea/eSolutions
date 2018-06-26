package p04prototype.dacic;

import p04prototype.Politician;

public class DacicPolitician extends Politician {

    private final String superpower;

    public DacicPolitician(String superpower) {
        this.superpower = superpower;
    }

    public DacicPolitician(DacicPolitician prototype) {
        this.superpower = prototype.superpower;
    }

    @Override
    public Politician copy() throws CloneNotSupportedException {
        return new DacicPolitician(this);
    }

    @Override
    public String toString() {
        return String.format("My superpower is: %s", "\u001B[31m" + superpower);
    }
}
