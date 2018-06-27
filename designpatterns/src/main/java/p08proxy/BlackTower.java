package p08proxy;

public class BlackTower implements WizzardTower {

    @Override
    public void enter(Wizzard wizzard) {
        System.out.println(String.format("Wizzard \"%s\" has entered the tower", wizzard.getName()));
        }
    }
