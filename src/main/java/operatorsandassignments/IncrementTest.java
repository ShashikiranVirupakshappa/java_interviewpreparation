package operatorsandassignments;

public class IncrementTest {
    public static void main(String[] args) {

        int x = 10;
        //int y = ++ (++x); // CE: after ++x it will become value and not variable so it will fail for next increment. becoz, next increment waiting for variable and not for value
        //int y = ++10;   // CE: variable required and not value becoz, after increment it should reassign to same variable.

        //int z = (x++) ++; // CE: after ++x it will become value and not variable so it will fail for next increment. becoz, next increment waiting for variable and not for value
        //int y = 10++; // CE: variable required and not value becoz, after increment it should reassign to same variable.

        //above is for increment operator, in the same way decrement operator works


        //int y = -- (--x); // CE: after --x it will become value and not variable so it will fail for next decrement. becoz, next decrement waiting for variable and not for value
        //int y = --10;   // CE: variable required and not value becoz, after decrement it should reassign to same variable.

        //int z = (x--) --; // CE: after --x it will become value and not variable so it will fail for next decrement. becoz, next decrement waiting for variable and not for value
        //int y = 10--; // CE: variable required and not value becoz, after decrement it should reassign to same variable.

        byte a = 10;
        byte b = 20;

        //byte c = a+b;   // formula for this =====> max(int, type of a, type of b) --> max(int, byte,byte) ==> int so it will return int after a+b addition and you are try to assign to byte

        byte c = 10;
        c++;
        System.out.println(c);

        byte d = 10;
        //d = d + 1;  //this addition will result in int and not byte so compile time error. CE: required byte but got int
        //System.out.println(d);

        byte w = 10;
        w += 1;
        System.out.println(w);


        int max = Integer.MAX_VALUE+2;
        byte e = (byte)max;
        System.out.println(e);

        int p = 64;
        System.out.println(p << 2);


        int g,h,i,j;
        g=h=i=j=20;
        g += h -= i *= j /= 2;
        System.out.println(g +" ... "+h +" ... "+i+" ... "+j);

        boolean q = false;

        String res = q ? "true" : "false";
        System.out.println(res);
        int o = 2;

        System.out.println(1+2*3/4+5*6); //32

        Class loadedClass = null;
        try {
            loadedClass = Class.forName("java.lang.String");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        Object object = null;
        try {
            object = loadedClass.newInstance();
        } catch (InstantiationException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }

        if(object instanceof String)
            System.out.println("tostring "+object.toString());


        /*try {
            Object o1 = Class.forName("java.lang.Comparable").newInstance();
            if(o1 instanceof Comparable)
                System.out.println("comparable");
        } catch (InstantiationException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }*/

        Thread t = new Thread();
        System.out.println((Runnable.class.isInstance(t)) );   //true

        Thread t1 = new Thread();
        System.out.println((t1 instanceof Runnable));	//true

        Thread t2 = new Thread();
        try {
            System.out.println(Class.forName(args[0]).isInstance(t2));
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        System.out.println(Thread.class.isInstance(t2));
        System.out.println(t2.getClass().isInstance(t2));
        System.out.println(Object.class.isInstance(t2));

        Object object1 = new Object();
        System.out.println(object1.getClass().isInstance(t2));

    }


}
