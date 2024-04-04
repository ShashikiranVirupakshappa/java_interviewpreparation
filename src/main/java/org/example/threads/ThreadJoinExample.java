package org.example.threads;



class Thread1 implements  Runnable {

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        for(int i=5;i<10;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}
public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();

        thread1.join();
        thread2.start();
        thread2.join();
    }
}
