package p11adapter;

import com.sun.rowset.internal.Row;

public class BoatFactory {
    public static RowingBoat createSmallBoat(){
        return new SmallBoat();
    }

    public static Submarine createSubmarine(){
        return new Submarine();
    }

    public static WindBoat createWindBoat(){
        return new WindBoat();
    }

    public static RowingBoat adaptSubmarine(Submarine submarine){
        return new SubmarineAdapter(submarine);
    }

    public static RowingBoat adaptWindBoat(WindBoat windBoat){
        return windBoat::row;
    }

}
