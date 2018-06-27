package p09javaproxy;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

@Builder
public class ListProxy<T> implements InvocationHandler {

    private List<T> underlying;
    private T fill;

    public List<T> getList() {

        if(underlying == null){
            underlying = Lists.newArrayList();
        }

        Class<ArrayList> targetClass = ArrayList.class;

        return (List<T>) Proxy.newProxyInstance(
                targetClass.getClassLoader(),
                targetClass.getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String methodName = method.getName();

        if(methodName.equals("add") || methodName.equals("addAll") && args.length == 2){
            while(underlying.size() < (Integer) args[0]){
                underlying.add(fill);
            }
        }


        Object result=method.invoke(underlying, args);
        return result;
    }
}
