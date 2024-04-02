import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("Parent main");
        System.out.println(Arrays.toString(args));
        int[] x = {10,20,30};
        int[] y = {40,50};

        //x = y;
        //y = x;

        /*var a = Integer.valueOf(10);

        System.out.println(a.getClass().getName());
        Arrays.stream(a.getClass().getDeclaredMethods()).forEach(System.out::println);*/

        new Test7().m1(x,y);
    }

    public void m1(int[]... y) {
        for(int[] y1: y) {
            System.out.println(y1[0]);
        }
    }
}

class C1 extends Test7 {
    public static void main(String... args) {
        System.out.println("Child main");
    }
}
