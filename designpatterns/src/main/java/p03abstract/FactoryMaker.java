package p03abstract;

import p03abstract.interfaces.KingdomFactory;

import java.util.Optional;

public class FactoryMaker {

    public static Optional<KingdomFactory> makeFactory(String type){

        String kingdomType = type.trim().toUpperCase();

        switch(kingdomType){

            case "DACIC":
                return Optional.of(new DacicKingdomFactory());
            case "ROMAN":
                return Optional.of(new RomanKingdomFactory());
            case "TURKISH":
                return Optional.of(new TurkishKingdomFactory());
            case "KLINGON":
                return Optional.of(new LambdaKingdomFactory("Klingon"));
            default:
                System.out.println(String.format("Kingdom type: \"%s\" not supported yet", type));
                return Optional.empty();
        }

    }

}
