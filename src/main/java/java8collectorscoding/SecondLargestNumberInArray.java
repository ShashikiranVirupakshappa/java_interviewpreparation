package java8collectorscoding;

import java.util.Comparator;
import java.util.List;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
