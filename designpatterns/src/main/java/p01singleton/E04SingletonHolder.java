package p01singleton;

public class E04SingletonHolder {

private E04SingletonHolder(){

}

private static class Holder {
    private static final E04SingletonHolder INSTANCE = new E04SingletonHolder();
}

public static E04SingletonHolder getInstance() {
    return Holder.INSTANCE;
}

}
