package p14mediator;

public interface PartyMember {

    String getName();

    void joinedParty(Party party);
    void partyAction(PartyMember who, Action a);

}
