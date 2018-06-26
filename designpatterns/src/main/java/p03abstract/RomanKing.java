package p03abstract;

import p03abstract.interfaces.King;

public class RomanKing implements King {
    @Override
    public String getKingDescription() {
        return "Roman King";
    }
}
