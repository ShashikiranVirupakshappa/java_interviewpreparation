package java8collectorscoding;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverseOrder {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c", "d","e");
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }


}
