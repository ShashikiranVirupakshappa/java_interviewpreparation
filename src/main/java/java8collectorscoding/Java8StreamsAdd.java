package java8collectorscoding;

import java.util.ArrayList;
import java.util.List;

public class Java8StreamsAdd {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.stream().forEach(s -> {
            list.add("20");
            System.out.println(s);
        });

        //list.parallelStream()
    }
}
