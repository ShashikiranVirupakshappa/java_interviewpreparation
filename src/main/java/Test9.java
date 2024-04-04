import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().count());*/
        //Given a String, find the first non-repeated character in it using Stream functions?
        String input = "Java articles are Awesome J";
        Map<String, Long> stringLongMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(stringLongMap.keySet().stream().filter(s -> stringLongMap.get(s)==1).findFirst().get());


        System.out.println(Arrays.stream(input.split("")).collect(Collectors.toMap(Function.identity(), Function.identity())));


    }
}
