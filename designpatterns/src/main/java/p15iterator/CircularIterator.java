package p15iterator;

import java.util.Iterator;

public class CircularIterator<T> implements Iterator<T> {

    private Integer innitialPosition;
    private T[] values;
    private static final int NOT_INITIALIZED = -1;
    private Integer currentPosition = NOT_INITIALIZED;

    public CircularIterator(T[] values, Integer initialPosition) {
        this.innitialPosition = initialPosition;
        this.values = values;
    }

    @Override
    public boolean hasNext(){
        return true;
    }

    @Override
    public T next() {
        if(currentPosition == NOT_INITIALIZED){
            this.currentPosition = innitialPosition;
            return values[currentPosition];
        }
        currentPosition = (currentPosition + 1) % values.length;
        return values[currentPosition];
    }
}
