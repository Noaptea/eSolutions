package p11adapter;

import lombok.val;

public class App {

    public static void main(String[] args) {
        val captain = new Captain("Joe");
        captain.setMyBoat(BoatFactory.createSmallBoat());

        MotorBoat motorBoat = new MotorBoat();
        Submarine submarine = new Submarine();

//        captain.setMyBoat(new MotorBoatAdapter(motorBoat));
//        captain.sail();
//
//        captain.setMyBoat((new SubmarineAdapter(submarine)));
//        captain.sail();

        captain.setMyBoat(new UniversalAdaptor(motorBoat));
        captain.sail();
        captain.setMyBoat(new UniversalAdaptor(submarine));
        captain.sail();

        WindBoat windBoat = BoatFactory.createWindBoat();
        captain.setMyBoat(BoatFactory.adaptWindBoat(windBoat));
        captain.sail();

        System.out.println(motorBoat.getClass().getTypeName());

    }

}
