package java8collectorscoding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatedElementInArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> stringLongMap = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Map.Entry<String, Long>> list = new ArrayList<>(stringLongMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return (int)-(o1.getValue().longValue()-o2.getValue().longValue());
            }
        });
        System.out.println(list.get(0).getKey()+" "+list.get(0).getValue());
    }
}