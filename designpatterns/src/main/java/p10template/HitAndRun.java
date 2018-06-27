package p10template;

public class HitAndRun extends StealingMethod {
    @Override
    public String pickTarget() {
        return "random guy";
    }

    @Override
    public String confuseTarget() {
        return "mace him";
    }

    @Override
    public String stealItem() {
        return "grab his phone";
    }
}
