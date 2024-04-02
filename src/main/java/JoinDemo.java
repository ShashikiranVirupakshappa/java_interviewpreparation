public class JoinDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
        a.join();
        b.join();
        c.join();
        System.out.println("main thread completes");
    }
}


class A extends Thread {
    @Override
    public void run() {
        System.out.println("A thread");
    }
}


class B extends Thread {
    @Override
    public void run() {
        System.out.println("B thread");
    }
}

class C extends Thread {
    @Override
    public void run() {
        System.out.println("C thread");
    }
}