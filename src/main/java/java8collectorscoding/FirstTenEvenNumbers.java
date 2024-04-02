package java8collectorscoding;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstTenEvenNumbers {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10).boxed().map(integer -> integer * 2).collect(Collectors.toList()));
    }
}
