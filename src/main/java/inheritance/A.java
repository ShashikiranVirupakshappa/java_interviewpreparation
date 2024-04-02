package inheritance;

public class A {

    public void m1() {
        System.out.println("parent no - arg");
    }
    public int m1(int i){
        return 10;
    }

    public float m1(float f) {
        return 15.0f;
    }

    public static void m2(String s) {
        System.out.println("A class static m2 "+s);
    }
}

class B extends A {
    public void m1(String s) {
        System.out.println("child arg");
    }

    public int m1(int i){
        return 20;
    }

    public float m1(float f1){
        return 16.0f;
    }

    public static void m2(String s) {
        System.out.println("B class static m2 "+s);
    }
    public static void main(String[] args) {
        A a1 = new A();
        A a = new B();
        System.out.println(a.m1(30));               //20
        System.out.println(a.m1(30.0f));            //16.0
        a.m2("shashi");                                     //A class static m2 shashi
        a1.m2("Shashi");                                    //A class static m2  Shashi
        a.m1();                                                     //parent no - arg
        a1.m1();                                                    //parent no-arg
        B b = new B();
        b.m1();                                                     //parent no - arg
        b.m1("Raj");                                        //child arg
    }
}


