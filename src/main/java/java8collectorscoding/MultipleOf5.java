package java8collectorscoding;

import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf5 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        System.out.println(integerList.stream().filter(integer -> integer % 5==0).collect(Collectors.toList()));
    }
}
