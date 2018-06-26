package p03abstract;

import p03abstract.interfaces.Army;
import p03abstract.interfaces.Castle;
import p03abstract.interfaces.King;
import p03abstract.interfaces.KingdomFactory;

public class LambdaKingdomFactory implements KingdomFactory {

    public final String type;

    public LambdaKingdomFactory(String type) {
        this.type = type;
    }


    @Override
    public Castle createCastle() {
        return () -> type +" Castle";
    }

    @Override
    public Army createArmy() {
        return () -> type + " Army";
    }

    @Override
    public King createKing() {
        return () -> type +" King";
    }

}
