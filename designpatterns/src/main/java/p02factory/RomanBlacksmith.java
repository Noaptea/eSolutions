package p02factory;

public class RomanBlacksmith implements Blacksmith {

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new RomanWeapon(weaponType);
    }
}
