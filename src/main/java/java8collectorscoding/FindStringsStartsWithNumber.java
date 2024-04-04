package java8collectorscoding;

import java.util.List;
import java.util.stream.Collectors;

public class FindStringsStartsWithNumber {
    public static void main(String[] args) {
        List<String> stringList = List.of("1a","b2","3c","d4","5e");
        System.out.println(stringList.stream().filter(s -> Character.isDigit(s.toCharArray()[0])).collect(Collectors.toList()));
    }
}
