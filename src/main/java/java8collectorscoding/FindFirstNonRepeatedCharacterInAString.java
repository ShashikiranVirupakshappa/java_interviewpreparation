package java8collectorscoding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacterInAString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        List<String> stringList = Arrays.asList(inputString.split(""));
        Map<String, Long> stringLongMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        for(Map.Entry<String, Long> entry: stringLongMap.entrySet()) {
            if(entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

}
