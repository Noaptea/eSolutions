package p03abstract;

import p03abstract.interfaces.Army;

public class RomanArmy implements Army {
    @Override
    public String getArmyDescription() {
        return "Roman Army";
    }
}
