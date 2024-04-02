package java8collectorscoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Merge2UnsortedArraysInto1SortedArrayWithoutDuplicates {
    public static void main(String[] args) {
        List<Integer> integers1 = List.of(4,2,7,1,3,5,9,6);
        List<Integer> integers2 = List.of(10,8,6,11,9,1,4,7);

        List<Integer> newList = new ArrayList<>(integers1);
        newList.addAll(integers2);

        System.out.println(newList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toSet()));


    }
}
