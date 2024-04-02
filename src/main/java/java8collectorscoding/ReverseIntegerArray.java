package java8collectorscoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10}).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
