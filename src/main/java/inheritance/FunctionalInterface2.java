package inheritance;

@java.lang.FunctionalInterface
public interface FunctionalInterface2 extends  Interface1 {
    public default void defaultMeth() {
        System.out.println("this is defaultMeth method");
    }
    public default void defaultMeth2() {
        System.out.println("this is defaultMeth2 method");
    }

    public static void staticMeth() {
        System.out.println("this is staticMeth method");
    }

    public static void staticMeth2(String s) {
        System.out.println("this is staticMeth2 method "+s);
    }
    public void m1();

    public boolean equals(Object o);

    public int hashCode();

}
