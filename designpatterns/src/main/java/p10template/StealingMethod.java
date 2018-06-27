package p10template;

public abstract class StealingMethod {

    public abstract String pickTarget();
    public abstract String confuseTarget();
    public abstract String stealItem();

    public void steal(){
        System.out.println(String.format("Chose target: %s", pickTarget()));
        System.out.println(String.format("Confuse target: %s", confuseTarget()));
        System.out.println(String.format("Steal item: %s",stealItem() ));
    }

}
