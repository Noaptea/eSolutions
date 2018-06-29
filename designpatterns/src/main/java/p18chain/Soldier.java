package p18chain;

import java.util.Optional;

public class Soldier {

    private final String type;
    private final Action act;
    private final Optional<Soldier> subordinate;

    public Soldier(String type, Action act) {
        this.type = type;
        this.act = act;
        subordinate = Optional.empty();
    }

    public Soldier(Soldier subordinate, String type, Action act) {
        this.type = type;
        this.act = act;
        this.subordinate = Optional.of(subordinate);
    }

    public void handleRequest(Request request){

        if(type.equalsIgnoreCase(request.getType())){
            act.doTheAction(request);
        }
        else{
            System.out.println(type + " says: Not my problem !");
            if(subordinate.isPresent()){
                System.out.println("Passing on to "+ subordinate.get().type);
                subordinate.get().handleRequest(request);
            }
        }

    }

}
