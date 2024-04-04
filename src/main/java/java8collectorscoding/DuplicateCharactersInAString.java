package java8collectorscoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCharactersInAString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        List<String> inputList = Arrays.asList(inputString.split(""));
        System.out.println(inputList.stream().filter(s -> inputList.indexOf(s)!=inputList.lastIndexOf(s)).distinct().collect(Collectors.toList()));
    }
}
