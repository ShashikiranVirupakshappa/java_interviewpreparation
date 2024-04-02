package inheritance;

public class AutomaticTypePromotionCheck {
    public static void main(String[] args) {
        m1(new StringBuffer("shashi"));
        m1(new String("shashi"));
    }

    public static void m1(Object o) {
        System.out.println("m1 object arg");
    }

    public static void m1(StringBuffer o) {
        System.out.println("m1 StringBuffer arg");
    }



}
