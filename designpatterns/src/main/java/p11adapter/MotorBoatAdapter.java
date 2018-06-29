package p11adapter;

import lombok.Data;

@Data
public class MotorBoatAdapter implements RowingBoat {

    private final MotorBoat motorBoat;

    @Override
    public void row() {
        motorBoat.startEngine();
    }



}
