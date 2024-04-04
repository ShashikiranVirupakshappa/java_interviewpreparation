package java8collectorscoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortStringsBasedUponLength {
    public static void main(String[] args) {
        List<String> list = List.of("pqrs","a","ab", "abcdef", "abc","abcd","abcde");

        System.out.println(list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));
        /*list.stream().map(s -> {
            Object[] stringLength = new Object[2];
        });*/


    }
}
