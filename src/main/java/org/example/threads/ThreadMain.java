package org.example.threads;


class ThreadA implements Runnable {

    private Object obj;
    public ThreadA(Object obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        try {
            synchronized (obj) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    Thread.yield();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ThreadB implements Runnable {
    private Object obj;
    public ThreadB(Object obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        synchronized (obj) {
            try {
                for (int j = 0; j <= 10; j++) {
                    System.out.println(Thread.currentThread().getName() + " " + j);
                    Thread.yield();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadC implements  Runnable {
    private Object obj;
    public ThreadC(Object obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        synchronized (obj) {
            try {
                for (int k = 0; k <= 10; k++) {
                    System.out.println(Thread.currentThread().getName() + " " + k);
                    Thread.yield();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadMain {

    public static void main(String[] args) {
        ThreadMain threadMain = new ThreadMain();
        Object object = new Object();
        try {
            Thread threadA = new Thread(new ThreadA(object));
            //threadA.setPriority(9);
            Thread threadB = new Thread(new ThreadB(object));
            //threadB.setPriority(5);
            Thread threadC = new Thread(new ThreadC(object));
            //threadC.setPriority(2);

            threadA.start();
            //threadA.join();
            threadB.start();
            //threadB.join();
            threadC.start();
            //threadC.join();
            System.out.println(threadA.getThreadGroup().getName());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
