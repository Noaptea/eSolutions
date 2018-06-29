package p14mediator;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

@Data
public class Party {

    private final String name;
    private List<PartyMember> members = Lists.newArrayList();

    public void action(PartyMember who, Action action){
        members.stream()
                .filter(currentMember -> !currentMember.equals(who))
                .forEach(member -> member.partyAction(who, action));
    }

    public void add(PartyMember member){
        members.add(member);
        member.joinedParty(this);
    }
}
