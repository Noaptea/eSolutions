package p10template;

public class SubtleMethod extends StealingMethod {
    @Override
    public String pickTarget() {
        return "tourist";
    }

    @Override
    public String confuseTarget() {
        return "sneak behind the guy";
    }

    @Override
    public String stealItem() {
        return "grab his wallet";
    }
}
