package p03abstract;

import p03abstract.interfaces.Castle;

public class RomanCastle implements Castle {
    @Override
    public String getCastleDescription() {
        return "Roman castle";
    }
}
