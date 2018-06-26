package p03abstract;

import p03abstract.interfaces.Army;
import p03abstract.interfaces.Castle;
import p03abstract.interfaces.King;
import p03abstract.interfaces.KingdomFactory;

public class RomanKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new RomanCastle();
    }

    @Override
    public Army createArmy() {
        return new RomanArmy();
    }

    @Override
    public King createKing() {
        return new RomanKing();
    }
}
