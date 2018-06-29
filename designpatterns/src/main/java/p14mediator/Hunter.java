package p14mediator;

import com.google.common.collect.Maps;
import lombok.Data;

import java.util.Map;
import java.util.Optional;

@Data
public class Hunter implements PartyMember {

    private final String name;
    private Map<Action, Reaction> reactions =Maps.newHashMap();

    @Override
    public void joinedParty(Party party) {
        System.out.println(String.format("Hunter %s has joined the party %s", name, party.getName()));
    }

    @Override
    public void partyAction(PartyMember who, Action a) {
        Optional<Reaction> currentAction = Optional.ofNullable(reactions.get(a));
        if(currentAction.isPresent()){
            currentAction.get().react(this, who);
        }
    }
}
