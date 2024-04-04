package flowcontrol;

import org.example.Patient;

public class SwitchTest {
    public static void main(String[] args) {
        Object o = new Object();
        String s = new String("shashi");
        String s1 = "raj";
        Patient patient = new Patient();
        Object switchObj = s1;
        String res = switch(switchObj) {
            case String s2 -> {
                System.out.println("String class instance");
                yield "string class object";
            }
            case Patient p -> {
                System.out.println("Patient class instance");
                yield "patient class object";
            }
            case Double d1 -> {
                yield "fdsfsdf";
            }
            case Object o1 -> {
                System.out.println("Object class instance");
                yield "object class object";
            }

        };
        System.out.println(res);
    }
}
