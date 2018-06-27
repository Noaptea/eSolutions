package p10template;

import lombok.Data;

@Data
public class Thief {

    private StealingMethod method;

    public void steal(){
        method.steal();
    }

}
