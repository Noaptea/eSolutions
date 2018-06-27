package p10template;

import lombok.val;

public class App {
    public static void main(String[] args) {
        val myRequest = new AlexRequest();

        System.out.println(myRequest);

        val thief = new Thief();

        thief.setMethod(new HItAndRun());
        thief.steal();

        System.out.println("\n");

        thief.setMethod(new SubtleMethod());
        thief.steal();
    }
}
