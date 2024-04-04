package hackerrank;

import inheritance.P;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static void main(String[] args) {
        //int n = 9;
        int n = 20;
        //int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] arr = {4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};
        System.out.println(sockMerchant(n,Arrays.stream(arr).boxed().collect(Collectors.toList())));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Long> integerLongMap = ar.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int numPairs = 0;
        for (Integer i : integerLongMap.keySet()) {
            if (integerLongMap.get(i).longValue() >= 2)
                numPairs += integerLongMap.get(i).longValue() / 2;
        }
        return numPairs;
    }
}
