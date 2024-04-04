package staticcontrolflow;

class Parent {
    static int x = 10;

    static {
        System.out.println("parent's first static block");
    }

    static {
        System.out.println("parent's second static block");
        m1();
    }

    public static  void m1() {
        System.out.println("m1 parent method");
        System.out.println("x= "+x);
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Parent's Main");
    }
}

public class Child extends Parent {
    static int y = 20;

    static {
        System.out.println("child's first static block");
    }

    static {
        System.out.println("child's second static block");
        m2();
    }

    public static  void m2() {
        System.out.println("m1 child method");
        System.out.println("y= "+y);
        System.out.println("x= "+x);
    }

    public static void main(String[] args){
        m2();
        System.out.println("Child's Main");
        //Parent.m1();

    }
}
/*public class StaticControlFlowParentChildExample {
    public static void main(String[] args){
        Child.m1();
        Parent.m1();

    }
}*/
