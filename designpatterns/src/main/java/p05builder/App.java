package p05builder;

public class App {

    public static void main(String[] args) {
        User user = User.builder()
                .withFirstName("Gigi")
                .withLastName("Becali")
                .withEmail("hahale@ra.com")
                .withWalet(new Walet(30000, "parai"))
                .build();

        System.out.println(user);

    }

}
