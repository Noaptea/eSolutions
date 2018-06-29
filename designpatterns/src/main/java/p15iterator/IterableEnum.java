package p15iterator;

import javafx.print.Collation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;

public class IterableEnum<E> implements Iterable<E> {



    private Integer initialPosition = 0;
    private Optional<E[]> values = Optional.empty();


//    public IterableEnum(E initialValue){
//        if(initialValue != null){
//            Class<?> enumClass = initialValue.getClass();
//            if(enumClass.isEnum()){
//                E[] values = (E())enumClass.getEnumConstants();
//                this.values = Optional.of(values);
//
//                try{
//                    Method ordinalMethod = enumClass.getMethod("ordinal");
//                    this.initialPosition = (Integer) ordinalMethod.invoke(initialValue);
//                }
//                catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
//                    e.printStackTrace();
//                }
//            }
//        }
//    }


    public IterableEnum(E initialValue) {

        if(initialValue != null && initialValue.getClass().isEnum()){
            E[] values = (E[])initialValue.getClass().getEnumConstants();
            this.values = Optional.of(values);
            try {
                Method m = initialValue.getClass().getMethod("ordinal");
                this.initialPosition = (Integer)m.invoke(initialValue);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public Iterator<E> iterator() {
        if(values.isPresent()){
            return new CircularIterator<>(values.get(), initialPosition);

        }
        return Collections.EMPTY_LIST.iterator();
    }
}
