package p14mediator;

public enum Action{
    HUNT ("hunted a dear"),
    GOLD ("found some gold");

    private final String description;

    Action(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.description.toLowerCase();
    }


}
