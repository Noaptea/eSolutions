package p01singleton;

public class App {
    public static void main(String[] args) {
        E01SimpleSingleton instance1 = E01SimpleSingleton.getInstance();
        E01SimpleSingleton instance2 = E01SimpleSingleton.getInstance();

        instance1.increment();
        instance1.increment();
        instance2.increment();
        instance2.increment();

        System.out.println(String.format("Counter value is: %d", instance2.getCount()));

        E05EnumSingleton enum1 = E05EnumSingleton.INSTANCE;
        E05EnumSingleton enum2 = E05EnumSingleton.INSTANCE;

        enum1.increment();
        enum2.increment();
        enum1.increment();
        enum2.increment();
        enum2.increment();
        enum2.increment();

        System.out.println(String.format("Enum count: %d", enum1.getCount()));

    }
}
