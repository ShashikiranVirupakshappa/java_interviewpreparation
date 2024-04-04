package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        StringJoiner stj = new StringJoiner("-");
        // Separated the elements with a comma in between.

        stj.add("Saket");
        stj.add("John");
        stj.add("Franklin");
        stj.add("Ricky");
        stj.add("Trevor");

        // Added elements into StringJoiner “stj”

        System.out.println(stj);

        Random random = new Random();
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        System.out.println(stringList.stream().filter(s -> s.length()>3).collect(Collectors.counting()).intValue());
        stringList.stream().filter(s -> s.length()>3).forEach(System.out::println);
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        integerList.stream().map(integer -> integer*3).forEach(System.out::println);


        List<Integer> integerList1 = Arrays.asList(1,2,3,4);
        List<Integer> integerList2 = Arrays.asList(5,6,7);

        integerList1.addAll(integerList2);

    }
}
