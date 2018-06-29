package p16threads;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import lombok.val;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class E07_InvokeAllExample {

    public static void main(String[] args) throws InterruptedException {
        val pool = Executors.newFixedThreadPool(4);

        val tasks = Arrays.asList(
                createCallable("C1", 3),
                createCallable("C2", 4),
                createCallable("C3", 5),
                createCallable("C4", 6)
        );

        List<Future<String>> futures = pool.invokeAll(tasks);

        futures.stream().map(f->{
            try {
                return f.get();
            } catch (InterruptedException | ExecutionException e) {
                return null;
            }
        })
                .filter(r->r !=null)
                .forEach(message -> System.out.println(message));

        pool.shutdown();
        }

    public static Callable<String> createCallable(String name, Integer sleepTime){
        return () -> {
                TimeUnit.SECONDS.sleep(sleepTime);
                return name + " results";
        };
    }
}
