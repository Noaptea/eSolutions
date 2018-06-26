package p05builder;

import javax.jws.soap.SOAPBinding;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private Walet walet;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.walet = builder.walet;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return String.format("Name is: %s %s \nWalet: %s", firstName, lastName, walet);
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private Walet walet;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withWalet(Walet walet) {
            this.walet = walet;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}
