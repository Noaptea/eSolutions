package p18chain;

public enum Request {

    TORTURE_PRISONER("soldier"),
    COMMAND_ARMY("general"),
    KILL_TRAITOR("corporal");

    private String type;


    Request(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
