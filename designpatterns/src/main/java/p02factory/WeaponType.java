package p02factory;

public enum WeaponType {

    SHORT_SWORD ("Short Sword"),
    SPEAR ("Spear"),
    AXE ("Axe");

    private String title;

    WeaponType(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
