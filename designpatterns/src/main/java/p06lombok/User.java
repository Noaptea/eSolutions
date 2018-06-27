package p06lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class User {
    private final String firstName;
    private final String lastName;
    @NonNull
    private final String email;
    @NonNull
    private final Wallet wallet;
}
