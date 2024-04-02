import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new int[] {2,222,204,567,890,432,234,211,22}).mapToObj(value -> ""+value).filter(s -> s.startsWith("2")).collect(Collectors.toList()));
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        Arrays.stream(new int[] {11,2,3,45,67,9,90,87,8,2}).map(value -> {
            if (value % 2 == 0)
                evens.add(value);
            else
                odds.add(value);

            return value;
        }).boxed().collect(Collectors.toList());
        System.out.println(evens);
        System.out.println(odds);

        System.out.println(Arrays.stream(new int[] {1,4,5,6,22,3,90,89,2,1,3,4,55,6}).reduce(0, (left, right) -> left+right));
        System.out.println(Arrays.stream(new int[] {1,4,5,6,22,3,90,89,2,1,3,4,55,6}).boxed().mapToInt(Integer::intValue).sum());
        System.out.println(Arrays.stream(new int[] {1,2,3,4,5}).boxed().collect(Collectors.averagingInt(value -> value)).doubleValue());

        Arrays.stream(new int[] {1,2,3,4,5}).boxed().mapToInt(value -> value.intValue()).average().ifPresent(System.out::println);

        Arrays.stream(new int[] {1,10,20,30,15}).boxed().mapToInt(value -> value*value).filter(value -> value>100).average().ifPresent(System.out::println);

        System.out.println(Arrays.stream(new int[] {1,3,10,20,30,15,1,13,1,2,2,10,30,19,3}).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(integerLongEntry -> integerLongEntry.getValue()>1).map(integerLongEntry -> integerLongEntry.getKey()).collect(Collectors.toList()));

        System.out.println(Arrays.stream(new int[] {1,3,10,20,30,15,1,13,1,2,2,10,40,19,3}).boxed().max(Comparator.naturalOrder()).get());
        System.out.println(Arrays.stream(new int[] {1,3,10,20,30,15,1,13,1,2,2,10,40,19,3}).boxed().max(Integer::compareTo).get());
        System.out.println(Arrays.stream(new int[] {1,3,10,20,30,15,1,13,1,2,2,10,40,19,3}).boxed().min(Comparator.naturalOrder()).get());
        System.out.println(Arrays.stream(new int[] {1,3,10,20,30,15,1,13,1,2,2,10,40,19,3}).boxed().min(Integer::compareTo).get());
        System.out.println(Arrays.stream(new int[] {-1,0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40}).boxed().sorted(Integer::compareTo).collect(Collectors.toList()));
        System.out.println(Arrays.stream(new int[] {-1,0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40}).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        System.out.println(Arrays.stream(new int[] {-1,0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40}).skip(5).map(Integer::valueOf).sum());
        System.out.println(Arrays.stream(new int[] {-1,0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40}).skip(5).boxed().collect(Collectors.summingInt(value -> value)).intValue());
    }
}

