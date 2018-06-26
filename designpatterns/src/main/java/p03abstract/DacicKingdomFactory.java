package p03abstract;

import p03abstract.interfaces.Army;
import p03abstract.interfaces.Castle;
import p03abstract.interfaces.King;
import p03abstract.interfaces.KingdomFactory;

public class DacicKingdomFactory implements KingdomFactory {


    @Override
    public Castle createCastle() {
        return new DacicCastle();
    }

    @Override
    public Army createArmy() {
        return new DacicArmy();
    }

    @Override
    public King createKing() {
        return new DacicKing();
    }
}
