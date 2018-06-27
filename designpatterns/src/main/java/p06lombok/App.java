package p06lombok;

import lombok.val;

public class App {
    public static void main(String[] args) {
       val user = User.builder()
               .firstName("Gigi")
               .lastName("Becali")
               .email("jiji@sheep.org")
               .wallet(Wallet.builder()
               .amount(100)
               .nume("Lei")
               .build())
               .build();
        System.out.println(user);
    }
}
