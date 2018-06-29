package p12facade.Computer;

public class App {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();

        computer.start();
        System.out.println("============================Mining Bitcoin==============================");
        computer.stop();
    }

}
