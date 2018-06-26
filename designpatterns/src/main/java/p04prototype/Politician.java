package p04prototype;

public abstract class Politician extends Prototype {

    @Override
    public abstract Politician copy() throws CloneNotSupportedException;

}
