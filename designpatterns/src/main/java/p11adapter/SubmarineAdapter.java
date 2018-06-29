package p11adapter;

import lombok.Data;

@Data
public class SubmarineAdapter implements RowingBoat{

    private final Submarine submarine;


    @Override
    public void row() {
        submarine.submerge();
    }
}
