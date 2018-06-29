package p11adapter;

import lombok.Data;


public class UniversalAdaptor implements RowingBoat {

//    private  MotorBoat motorBoat;
//    private Submarine submarine;
    private Object adaptor;


    public UniversalAdaptor(Object motorBoat) {
        this.adaptor = motorBoat;
    }

//    public UniversalAdaptor(Submarine submarine) {
//        this.adaptor = submarine;
//    }

    @Override
    public void row() {
        switch(adaptor.getClass().getTypeName()){
            case "p11adapter.MotorBoat":
                }

    }
}
