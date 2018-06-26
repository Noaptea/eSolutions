package p04prototype.dacic;

import p04prototype.Blacksmith;
import p04prototype.Politician;
import p04prototype.Soldier;

import java.util.Optional;

public class DacicFactory {

    private static DacicFactory INSTANCE;

    private Soldier soldier;
    private Blacksmith blacksmith;
    private Politician politician;

    private DacicFactory(Soldier soldier, Blacksmith blacksmith, Politician politician) {
        this.soldier = soldier;
        this.blacksmith = blacksmith;
        this.politician = politician;
    }

    public Optional<Soldier> createSoldier(){
        try{
            return Optional.of(soldier.copy());
        }
        catch (CloneNotSupportedException e) {
            return Optional.empty();
        }
    }
    public Optional<Blacksmith> createBlacksmith(){
        try{
            return Optional.of(blacksmith.copy());
        }
        catch (CloneNotSupportedException e) {
            return Optional.empty();
        }
    }
    public Optional<Politician> createPolitician(){
        try{
            return Optional.of(politician.copy());
        }
        catch (CloneNotSupportedException e) {
            return Optional.empty();
        }
    }

    public static DacicFactory getFactory(){

        if(INSTANCE == null){
            INSTANCE = new DacicFactory(
                    new DacicSoldier("sing"),
                    new DacicBlacksmith("magic iron"),
                    new DacicPolitician("tell truth")
            );
        }
        return INSTANCE;
    }

}
