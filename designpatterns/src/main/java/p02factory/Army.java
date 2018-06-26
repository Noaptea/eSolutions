package p02factory;

public class Army {

    private final Blacksmith blacksmith;

    public Army(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public static Army createDacicArmy() {
        return new Army(new DacicBlacksmith());
    }

    public static Army createRomanArmy() {
        return new Army(new RomanBlacksmith());
    }

    public void prepareYourWeapons(){


        Weapon w1 = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        Weapon w2 = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(w1);
        System.out.println(w2);
    }

}
