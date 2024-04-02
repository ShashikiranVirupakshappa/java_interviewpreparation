package java8collectorscoding;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxMinNumbersFromList
{
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println(list.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList()));
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));
    }
}
