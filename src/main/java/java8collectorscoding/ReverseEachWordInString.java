package java8collectorscoding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String statement = "i am on java learning";
        System.out.println(Arrays.stream(statement.split(" ")).map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" ")));
    }

}
