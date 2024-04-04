public class Trycatchreturnexample {
    public static void main(String[] args) {
        System.out.println(extracted());
    }

    private static int extracted() {
        int a = 10;
        int b = 1;

        try {
            int c = a/b;
            return c;
        }catch (Exception e) {
            return -10;
        }
    }
}
