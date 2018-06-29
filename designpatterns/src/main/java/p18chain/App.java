package p18chain;

import lombok.val;

public class App {
    public static void main(String[] args) {

        val soldier = new Soldier("soldier", request -> {
            System.out.println("Soldier is handling request %s "+request);
        });

        val corporal = new Soldier(soldier, "corporal",  request -> {
            System.out.println("Corporal is handling request %s" + request);
        });

        val general = new Soldier(corporal, "general",  request -> {
            System.out.println("General is handling request %s" + request);
        });

        general.handleRequest(Request.TORTURE_PRISONER);
//        general.handleRequest(Request.COMMAND_ARMY);
//        general.handleRequest(Request.KILL_TRAITOR);

    }
}
