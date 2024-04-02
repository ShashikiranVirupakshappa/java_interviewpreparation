package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElementsFromMergedList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 8);
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        Set<Integer> set = new HashSet();
        System.out.println(list.stream().filter(integer -> set.add(integer)).collect(Collectors.toSet()));
/*        LinkedHashMap<Integer, Long> map = list.stream().collect(Collectors.groupingBy(integer -> integer, LinkedHashMap::new, Collectors.counting()));

        System.out.println(map.keySet().stream().filter(integer -> set.add(integer)).collect(Collectors.toSet()));*/


        int value = list.stream().reduce(0, Integer::sum).intValue();

        System.out.println(list.stream().map(integer -> integer+value).collect(Collectors.toList()));

        String[] countries = {"India","USA", "Canada", "Japan", "France", "Italy", "Germany"};

        System.out.println(Arrays.stream(countries).map(String::toUpperCase).collect(Collectors.joining(", ")).toString());
    }
}
