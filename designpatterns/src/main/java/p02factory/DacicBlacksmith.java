package p02factory;

public class DacicBlacksmith implements Blacksmith {

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new DacicWeapon(weaponType);
    }

}
