package java8collectorscoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"a", "ab", "abc", "pqr", "xyz"};
        String[] arr2 = new String[]{"abc","def", "stuv", "jkl", "xyz"};
        List<String> arr2List = Arrays.asList(arr2);
        List<String> arr1List = Arrays.asList(arr1);

        System.out.println(arr1List.stream().filter(s -> arr2List.contains(s)).collect(Collectors.toList()));

    }
}
