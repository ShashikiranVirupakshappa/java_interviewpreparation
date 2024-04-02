package java8collectorscoding;

import java.util.stream.IntStream;

public class SumAndAverageOfAllElementsInArray {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        System.out.println(intStream.sum());
        intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println(intStream.average().getAsDouble());
    }
}
