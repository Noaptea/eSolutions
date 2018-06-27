package p09javaproxy;

import lombok.val;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        val myList =  ListProxy.<Integer>builder()
//        .underlying(Lists.newArrayList())
                .fill(70)
                .build()
                .getList()
                ;

//        List<Integer> myList = (List<Integer>)Proxy.newProxyInstance(App.class.getClassLoader(), ArrayList.class.getInterfaces(), handler);

        myList.add(3);
        myList.add(5);
        myList.add(70);

        myList.add(2, 3);
        myList.add(10, 80);

        System.out.println(myList);

        val stringList = ListProxy.<String>builder().fill("ceva").build().getList();

        stringList.add(3,"altceva");
        stringList.addAll(5, Arrays.asList("doi", "trei", "patru"));

        System.out.println(stringList);
    }
}
