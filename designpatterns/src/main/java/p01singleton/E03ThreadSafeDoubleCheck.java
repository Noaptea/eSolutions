package p01singleton;

public class E03ThreadSafeDoubleCheck {

    private static E03ThreadSafeDoubleCheck INSTANCE;

    private E03ThreadSafeDoubleCheck(){}

    public static E03ThreadSafeDoubleCheck getInstance() {

        E03ThreadSafeDoubleCheck localInstance = INSTANCE;

        if(localInstance == null){
            //TODO sync code here
            synchronized (E03ThreadSafeDoubleCheck.class){
                localInstance = INSTANCE;
                if(localInstance == null){
                    INSTANCE = localInstance = new E03ThreadSafeDoubleCheck();
                }
            }
        }
        return localInstance;
    }

}
