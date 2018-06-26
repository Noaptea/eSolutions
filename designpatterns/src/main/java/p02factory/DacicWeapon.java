package p02factory;

public class DacicWeapon implements Weapon {

    private WeaponType weaponType;

    public DacicWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return String.format("%s dacic", weaponType);
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
