package pkg1;

public class Test {

    static Integer i;

    private Test() {
        i=i+100;
    }

    private static Integer m2() {
        return 500;
    }

    private static Integer m1(Integer i) {
        return i+i;
    }

    public static void main(String[] args) {
        Test t1 = new Test();      //0+100 = 100
        Test t2 = new Test();      //100+100 = 200
        t1.i = m1(m2());
        t2.i = m1(m2())+m1(m2());
        System.out.println(t1.i);
        System.out.println(t2.i);
    }
}
