package java8collectorscoding;

import java.util.*;

public class SortStringsBasedUponLengthWithoutJava8Functions {
    public static void main(String[] args) {
        List<String> list = List.of("pqrs","a","ab", "abcdef", "abc","abcd","abcde");
        List<String> newList = new ArrayList<>(list);

        Collections.sort(newList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        System.out.println(newList);
    }
}
