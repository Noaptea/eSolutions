package p03abstract;

import p03abstract.interfaces.Army;
import p03abstract.interfaces.Castle;
import p03abstract.interfaces.King;
import p03abstract.interfaces.KingdomFactory;

public class TurkishKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return () -> "Turkish Castle";
    }

    @Override
    public Army createArmy() {
        return () -> "Turkish Army";
    }

    @Override
    public King createKing() {
        return () -> "Turkish King";
    }
}
