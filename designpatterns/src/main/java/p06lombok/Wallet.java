package p06lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Wallet {
    private  Integer amount;
    private  String nume;
}
