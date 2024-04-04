package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class Super {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        System.out.println("setter i");
        this.i = i;
    }

    public Super() {
        System.out.println("Super constructor");
    }

    public Super(int i) {
        System.out.println("Super parameters constructor");
        this.i=i;
    }
}

class Sub extends Super {
    private int j;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Sub() {
        System.out.println("Sub constructor");
    }

    public Sub(int i, int j) {
        System.out.println("Sub parameters constructor");
        super.setI(i);
        this.j = j;
    }

    public void display() {
        System.out.println("i value is "+getI()+" j value is "+j);
    }

    public static void staticMethod() {
        System.out.println("this is static method");
    }
}

public class ReflectionTest {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<Sub> subClass = (Class<Sub>) Class.forName("reflections.Sub");
        Sub sub = null;
        for (Constructor constructor : subClass.getDeclaredConstructors()) {
            System.out.println(constructor.getName());
            if(constructor.getParameterCount()>0) {
                sub = (Sub) constructor.newInstance(new Object[]{10, 20});
                System.out.println(sub.getI() + " ... " + sub.getJ());
            }else {
                sub = (Sub) constructor.newInstance(new Object[]{});
                System.out.println(sub.getI() + " ... " + sub.getJ());
            }
        }

        for(Method method : subClass.getDeclaredMethods()) {
            if(method.getName().equals("display"))
                method.invoke(sub, new Object[] {});
            else if(method.getName().equals("staticMethod"))
                method.invoke(null, new Object[]{});
        }
        System.out.println(subClass.getCanonicalName());
    }
}
