package p11adapter;


import lombok.Data;

@Data
public class Captain {

private final String name;
private RowingBoat myBoat;

    public void sail(){
    myBoat.row();
}

}
