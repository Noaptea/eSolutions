package p01singleton;

public class E01SimpleSingleton {

//    private static final E01SimpleSingleton INSTANCE = new E01SimpleSingleton();
    private static E01SimpleSingleton INSTANCE;


    public static final int STEP = 1;

    private Integer count = 0;

    private E01SimpleSingleton(){

    }

//    public static E01SimpleSingleton getInstance(){
//        return INSTANCE;
//    }

    public static E01SimpleSingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE = new E01SimpleSingleton();
        }
        return INSTANCE;
    }

    public Integer increment(){
        this.count += STEP;
        return this.count;
    }

    public Integer getCount() {
        return count;
    }
}
