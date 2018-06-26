package p04prototype;

public abstract class Soldier extends Prototype {

    @Override
    public abstract Soldier copy() throws CloneNotSupportedException;

}
