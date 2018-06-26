package p05builder;

public class Walet {

    private Integer amount;
    private String name;

    public Walet(Integer amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %s", amount, name);
    }
}
