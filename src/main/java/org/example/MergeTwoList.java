package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(3,4,5,6,7,8);

        System.out.println(Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList()));
    }
}
