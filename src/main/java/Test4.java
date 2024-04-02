import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        String input = "my name is bob i can speak malayalam";
        String[] splits = input.split(" ");
        System.out.println(findPalindromeStrings(splits));
    }

    private static List<String> findPalindromeStrings(String[] splits) {
        return Arrays.stream(splits).filter(s -> {
            if(s.length()>1)
                return new StringBuilder(s).reverse().toString().equals(s);
            return false;
        }).collect(Collectors.toList());
    }
}
