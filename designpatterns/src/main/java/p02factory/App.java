package p02factory;

public class App {
    public static void main(String[] args) {
        Army dacicArmy = Army.createDacicArmy();
        dacicArmy.prepareYourWeapons();

        Army romanArmy = Army.createRomanArmy();
        romanArmy.prepareYourWeapons();
    }
}
