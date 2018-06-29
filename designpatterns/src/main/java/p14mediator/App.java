package p14mediator;

import lombok.val;

public class App {

    public static void main(String[] args) {

        Party huntingParty = new Party("great");

        val gigi = new Hunter("Gigi");
        val tiriac = new Hunter("Tiriac");

        gigi.getReactions().put(Action.GOLD,((reactingMember, actionMember) -> {
            System.out.println(reactingMember.getName() + " is happy because " + actionMember.getName() + " has found gold ");
        }));

        huntingParty.add(gigi);
        huntingParty.add(tiriac);

        huntingParty.action(tiriac, Action.GOLD);

    }

}
