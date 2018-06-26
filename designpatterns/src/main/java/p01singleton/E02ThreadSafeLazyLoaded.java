package p01singleton;

public class E02ThreadSafeLazyLoaded {

private static E02ThreadSafeLazyLoaded INSTANCE;

private E02ThreadSafeLazyLoaded(){

}

public static synchronized E02ThreadSafeLazyLoaded getInstance(){
    if(INSTANCE == null) {
        INSTANCE = new E02ThreadSafeLazyLoaded();
    }
    return INSTANCE;
}

}
