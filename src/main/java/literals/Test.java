package literals;

public class Test {
    public static void main(String[] args) {
        //Octal Form
        int x = 0116;
        System.out.println(x);      //8
        //Binary Form
        int y = 0b10;
        System.out.println(y);      //2
        //Hexadecimal Form
        int z = 0X10;
        System.out.println(z);      //A
        //Decimal Form - Default Form
        int a = 10;
        System.out.println(a);      //10

        float f = 123.456f;
        System.out.println(f);

        int b = 10_11_01_101;
        System.out.println(b);

    }
}
