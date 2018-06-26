package p01singleton;

public enum  E05EnumSingleton {

    INSTANCE;

    private Integer count = 0;

    public Integer increment() {
        count +=1 ;
        return count;
    }

    public Integer getCount(){
        return count;
    }

}
