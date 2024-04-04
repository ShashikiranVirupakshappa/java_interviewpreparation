package java8collectorscoding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharactersInString {
    public static void main(String[] args) {
        String str = "shashi";

        Map<String, Long> longMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        longMap.keySet().stream().forEach(s -> System.out.println(s+" -> "+longMap.get(s)));

    }
}
