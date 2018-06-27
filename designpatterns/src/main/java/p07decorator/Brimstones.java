package p07decorator;

import lombok.Builder;

import java.util.function.Function;

@Builder
public class Brimstones implements Creature{

    private final Creature toBeDecorated;
//    private final Integer incrementPower;
    private Function<Integer, Integer> upgradePower;
    private Function<String, String> upgradeAttack;
    private Function<String, String> upgradeFlee;
    private final Function IDENTITY_FUNCTION = x -> x;

    @Override
    public String attack() {
//        return String.format("Upgraded %s", toBeDecorated.attack());
        return checkNull(upgradeAttack).apply(toBeDecorated.attack());
    }

    @Override
    public Integer getAttackPower() {
//        return toBeDecorated.getAttackPower() + incrementPower;
        return checkNull(upgradePower).apply(toBeDecorated.getAttackPower());
    }

    private <T> Function<T,T> checkNull (Function<T, T> function){
        if(function == null){
            return IDENTITY_FUNCTION;
        }
        return function;
    }

    @Override
    public String fleeBattle() {
//        return String.format("Upgraded %s", toBeDecorated.fleeBattle());
        return checkNull(upgradeFlee).apply(toBeDecorated.fleeBattle());
    }
}
