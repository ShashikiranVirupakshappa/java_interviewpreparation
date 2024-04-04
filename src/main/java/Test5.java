import java.util.Arrays;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(0,1,1,0,1,0,1,1,1,0,0).stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())));
    }
}
