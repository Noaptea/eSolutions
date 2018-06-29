package p17command;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Target {

    private Size size;
    private Visibility visibility;

}
