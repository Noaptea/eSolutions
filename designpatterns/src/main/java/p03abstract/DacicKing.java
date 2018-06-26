package p03abstract;

import p03abstract.interfaces.King;

public class DacicKing implements King {
    @Override
    public String getKingDescription() {
        return "Dacic King";
    }
}
