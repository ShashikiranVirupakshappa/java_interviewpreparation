package inheritance;


class A1 {
    public void m1(int... x){

    }
}
class B1 extends A1 {
    public void m1(int x) {                     //overloading

    }


    public void m1(int... x) {                  //overriding

    }
}
public class VarArgsOverriding {
    public static void main(String[] args) {

    }
}
