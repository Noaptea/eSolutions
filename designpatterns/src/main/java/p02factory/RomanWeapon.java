package p02factory;

public class RomanWeapon implements Weapon {

    private WeaponType weaponType;

    public RomanWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return String.format("%s roman", weaponType);
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
