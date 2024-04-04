package singletoncheck;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    private Singleton() {

    }

    private static class SingletonHelper {

        private static final Singleton INSTANCE = new Singleton();

        private void m1() {
            Singleton singleton = new Singleton();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return SingletonHelper.INSTANCE;
    }

    public static Singleton getInstance() {

        return SingletonHelper.INSTANCE;
    }

    private Object readResolve() {
        return SingletonHelper.INSTANCE;
    }
}
