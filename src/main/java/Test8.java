import java.util.Arrays;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().filter(n ->n%2==0).mapToInt(n -> n*2).sum());
    }
}
