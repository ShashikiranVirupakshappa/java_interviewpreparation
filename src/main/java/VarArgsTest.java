import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class VarArgsTest {
    public static void main(String... args) {
        m1();
        m1(10);
        m1(10, 20);
        m1(10,20,30);
        m1(10,20,30,40);
        m1(new int[] {10,20,30,40,50});
    }

    public static void m1(int... x) {
        //System.out.println(Arrays.stream(x).sum());
        for(int x1: x)
            System.out.println(x1);
        System.out.println("============================");
    }


}
